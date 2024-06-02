package com.mimaraslan.dao;

import com.mimaraslan.model.Agent;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AgentDAO {
    // JPA  - Save     Get     Update  Delete
    // CRUD - Create   Read    Update  Delete
    // SQL  - Insert   Select  Update  Delete

  /*
   public void save (Agent agent){

    Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

                 session.save(agent);

            transaction.commit();

        } catch (HibernateException e) {

            transaction.rollback();
            System.out.println("Error: " + e);

        } finally {
            session.close();
        }

   }

    public void update (Agent agent){

            Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

                 session.update (agent);

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
*/
    public void saveOrUpdateAgent (Agent agent){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

                 session.saveOrUpdate(agent);

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



    public Agent getAgentFindById (Long id){

       // id - sorgu - iş oluş - service

        Session session = HibernateUtil.getSessionFactory().openSession();

        try{

            return  session.get(Agent.class, id);

        } catch (HibernateException e) {
            System.out.println("Error: " + e);
            return null;
        } finally {
            session.close();
        }

    }


    public List<Agent> getAgentFindAll (){

        // bütün all - sorgu - iş oluş - service

        Session session = HibernateUtil.getSessionFactory().openSession();

        try{

            return  session.createQuery("FROM Agent").list();

        } catch (HibernateException e) {
            System.out.println("Error: " + e);
            return null;
        } finally {
            session.close();
        }
    }






    public boolean deleteAgentFindById (Long id){

            Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

           Agent agent  =  session.get(Agent.class, id);

           if(agent != null){
               session.delete(agent);
                  System.out.println("Successfully deleted agent");
               transaction.commit();
               return  true;
           } else {
               System.out.println("Agent not found");
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
