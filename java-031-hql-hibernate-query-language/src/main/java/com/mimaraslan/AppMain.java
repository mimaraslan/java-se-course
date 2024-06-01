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
import java.util.Random;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 =  new Customer();
        customer1.setFirstName("Adem");
        customer1.setLastName("Kok");

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

        CustomerDetail customerDetail2 = new CustomerDetail();
        customerDetail2.setAddress("Ankara");
        customerDetail2.setPhoneNumber("9999999");
        customerDetail2.setEmail("ankara06abc@gmail.com");
        customerDetail2.setCreateDate(new Date());

        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);



        Customer customer3 =  new Customer("Atila", "Güneş");
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



            System.out.println("========== AVG SUM MIN MAX COUNT ===========");


            System.out.println("================= JOIN ====================");




            transaction.commit();

        } catch (HibernateException e) {

        } finally {
            session.close();
        }




    }


}