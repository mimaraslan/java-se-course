package com.mimaraslan;

import com.mimaraslan.entity.Employee;
import com.mimaraslan.entity.Owner;
import com.mimaraslan.entity.Person;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Person person = new Person("A", "B");
       // person.setPersonId(1L);

        Employee employee = new Employee("C", "D", "Marketing", new Date());
       // employee.setPersonId(2L);

        Owner owner = new Owner("E", "F", 300L, 20L);
       // owner.setPersonId(3L);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

                 session.save(person);
                 session.save(employee);
                 session.save(owner);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.err.println("Hata: " + e);
        } finally {
            session.close();
        }

    }
}