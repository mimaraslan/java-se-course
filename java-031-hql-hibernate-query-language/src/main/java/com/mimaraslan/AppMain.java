package com.mimaraslan;

import com.mimaraslan.entity.Customer;
import com.mimaraslan.entity.CustomerDetail;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 =  new Customer();
        customer1.setFirstName("Adem");
        customer1.setLastName("Kok");
        customer1.setAge((byte) 25);

        CustomerDetail customerDetail1 = new CustomerDetail();
        customerDetail1.setAddress("Berlin");
        customerDetail1.setPhoneNumber("11111111");
        customerDetail1.setEmail("abc@gmail.com");
        customerDetail1.setCreateDate(new Date());

        customerDetail1.setCustomer(customer1);
        customer1.setCustomerDetail(customerDetail1);




        Customer customer2 =  new Customer();
        customer2.setFirstName("Tunahan");
        customer2.setLastName("Karakök");
        customer1.setAge((byte) 27);

        CustomerDetail customerDetail2 = new CustomerDetail();
        customerDetail2.setAddress("Ankara");
        customerDetail2.setPhoneNumber("9999999");
        customerDetail2.setEmail("ankara06abc@gmail.com");
        customerDetail2.setCreateDate(new Date());

        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);



        Customer customer3 =  new Customer("Atila", "Güneş");
        customer1.setAge((byte) 18);


        CustomerDetail customerDetail3 = new CustomerDetail( );
        customerDetail3.setAddress("İzmir");
        customerDetail3.setPhoneNumber("35353535");
        customerDetail3.setEmail("izmir35@gmail.com");
        customerDetail3.setCreateDate(new Date());

        customerDetail3.setCustomer(customer3);
        customer3.setCustomerDetail(customerDetail3);




        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

                session.save(customer1);
                session.save(customer2);
                session.save(customer3);


            System.out.println("================ SELECT ====================");
            Query query = session.createQuery("FROM Customer");

            List<Customer> customers = query.list();

            for (Customer customer : customers) {
                System.out.println(customer.getCustomerId() + " - " + customer.getFirstName() + " " + customer.getLastName());
            }



            System.out.println("================ WHERE ====================");


            // Eski sürümlerde
         //   Query query2 = session.createQuery("FROM Customer WHERE customerId = :customerId");
         //   query2.setLong("customerId", 1);


           /*
            Random rand = new Random();
            int randId = rand.nextInt(1000);
            System.out.println("Random ID: " + randId);
            */

            // Yeni kod hali
            Query query2 = session.createQuery("FROM Customer WHERE customerId = :customerId")
                    .setParameter("customerId", 1);

            Customer cust2 = (Customer) query2.uniqueResult();
            System.out.println(cust2.getCustomerId() + " - " + cust2.getFirstName() + " " + cust2.getLastName());



            System.out.println("================ DELETE ====================");


            Query query3 = session.createQuery("DELETE FROM CustomerDetail WHERE customerId = :customerId")
                    .setParameter("customerId", 1);

            int queryResult3 = query3.executeUpdate();
            System.out.println("CustomerDetail tablosunda: " + queryResult3);


            // FIXME   cascade = CascadeType.ALL yapmaya çalışılacak.
            Query query4 = session.createQuery("DELETE FROM Customer WHERE customerId = :customerId")
                    .setParameter("customerId", 1);

            int queryResult4 = query4.executeUpdate();
            System.out.println("Customer tablosunda: " + queryResult4);



            System.out.println("========== COUNT AVG SUM MIN MAX  ===========");
            Query query5 = session.createQuery("SELECT COUNT (*) FROM Customer");

            Long countResult = (Long) query5.uniqueResult();
            System.out.println("COUNT: " + countResult);

            // TODO : SUM MIN MAX AVG sorguları eklenecek.




            System.out.println("================= JOIN ====================");

               /*
                       SELECT *
                        FROM Table A
                        RIGHT JOIN Table B
                        ON A.id = B.id

                    */

                Query query6 = session.createQuery(  "SELECT c.firstName, c.lastName " +
                                                        "FROM Customer  c "  +
                                                        "RIGHT JOIN CustomerDetail  d  " +
                                                        "ON c.customerId = d.customerId");

/*
            // Java 10+ son sürümlerde 3 tırnak
            Query query6 = session.createQuery("""
                                            SELECT c.firstName, c.lastName
                                            FROM Customer  c
                                            RIGHT JOIN CustomerDetail  d
                                            ON c.customerId = d.customerId""");
            */





            List<Object> custList6 = query6.list();

            // FIXME Object - Customer arasında yazdırma için kod geliştirilecek.
  /*          for (Customer cust6 : custList6) {
                System.out.println(cust6.getFirstName() + " " + cust6.getLastName() + " " + cust6.getAge() + " " +
                         cust6.getCustomerDetail().getAddress() +
                         cust6.getCustomerDetail().getCreateDate())  ;
            }
*/

            transaction.commit();

        } catch (HibernateException e) {

        } finally {
            session.close();
        }




    }


}