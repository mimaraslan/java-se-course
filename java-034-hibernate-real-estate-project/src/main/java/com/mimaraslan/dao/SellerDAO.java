package com.mimaraslan.dao;

import com.mimaraslan.model.Seller;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SellerDAO {

    public void saveOrUpdateSeller (Seller seller){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

            session.saveOrUpdate(seller);

            transaction.commit();

        } catch (HibernateException e) {

            if(transaction != null){
                transaction.rollback();
            }

            System.out.println("Error: " + e);

        } finally {
            session.close();
        }

    }

    public Seller getSellerFindById (Long id){

        Session session = HibernateUtil.getSessionFactory().openSession();

        try{

            return  session.get(Seller.class, id);

        } catch (HibernateException e) {
            System.out.println("Error: " + e);
            return null;
        } finally {
            session.close();
        }

    }

    public List<Seller> getSellerFindAll (){

        Session session = HibernateUtil.getSessionFactory().openSession();

        try{

            return  session.createQuery("FROM Seller").list();

        } catch (HibernateException e) {
            System.out.println("Error: " + e);
            return null;
        } finally {
            session.close();
        }
    }

    public boolean deleteSellerFindById (Long id){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

            Seller seller  =  session.get(Seller.class, id);

            if(seller != null){
                session.delete(seller);
                System.out.println("Successfully deleted seller");
                transaction.commit();
                return  true;
            } else {
                System.out.println("Seller not found");
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