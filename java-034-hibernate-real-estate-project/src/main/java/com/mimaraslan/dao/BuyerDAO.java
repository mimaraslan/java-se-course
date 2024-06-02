package com.mimaraslan.dao;

import com.mimaraslan.model.Buyer;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BuyerDAO {

    public void saveOrUpdateBuyer(Buyer buyer) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.saveOrUpdate(buyer);

            transaction.commit();

        } catch (HibernateException e) {

            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println("Error: " + e);

        } finally {
            session.close();
        }

    }

    public Buyer getBuyerFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.get(Buyer.class, id);

        } catch (HibernateException e) {
            System.out.println("Error: " + e);
            return null;
        } finally {
            session.close();
        }

    }

    public List<Buyer> getBuyerFindAll() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.createQuery("FROM Buyer").list();

        } catch (HibernateException e) {
            System.out.println("Error: " + e);
            return null;
        } finally {
            session.close();
        }
    }

    public boolean deleteBuyerFindById (Long id){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

            Buyer buyer  =  session.get(Buyer.class, id);

            if(buyer != null){
                session.delete(buyer);
                System.out.println("Successfully deleted buyer");
                transaction.commit();
                return  true;
            } else {
                System.out.println("Buyer not found");
                return false;
            }


        } catch (HibernateException e) {

            if(transaction != null){
                transaction.rollback();
            }

            System.out.println("Error: " + e);
            return false;

        } finally {
            session.close();
        }



    }

}