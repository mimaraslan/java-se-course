package com.mimaraslan;


import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AppMain {
    public static void main(String[] args) {



        // CRUD - Create   Read    Update  Delete
        // SQL  - Insert   Select  Update  Delete



        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();
/*
            session.save();
            session.save();
            session.save();
*/
            transaction.commit();

        } catch (HibernateException e) {

        } finally {
            session.close();
        }


    }
}