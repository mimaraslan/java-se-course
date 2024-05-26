package com.mimaraslan;

import com.mimaraslan.entity.Customer;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 =  new Customer("Adem", "Kok");

        Customer customer2 =  new Customer();
        customer2.setFirstName("Tunahan");
        customer2.setLastName("Bey");

        Customer customer3 =  new Customer("Atila", "Güneş");

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