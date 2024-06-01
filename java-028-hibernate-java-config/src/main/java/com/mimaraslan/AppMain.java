package com.mimaraslan;

import com.mimaraslan.entity.Customer;
import com.mimaraslan.entity.CustomerDetail;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

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

            transaction.commit();

        } catch (HibernateException e) {

        } finally {
            session.close();
        }




    }


}