package com.mimaraslan;

import com.mimaraslan.entity.Employee;
import com.mimaraslan.entity.Owner;
import com.mimaraslan.entity.Person;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        Person person = new Person();
      //  person.setPersonId(1L);
        person.setFirstname("Abdullah");
        person.setLastname("Demirel");

        Employee employee = new Employee();
      //  employee.setPersonId(2L);
       // employee.setFirstname("Oğuz");
       // employee.setLastname("Akkaya");
        employee.setDepartmentName("Marketing");
        employee.setJoiningDate( new Date());

        Owner owner = new Owner();
      //  owner.setPersonId(3L);
       // owner.setFirstname("Sadık");
      //  owner.setLastname("Kuzu");


        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

            session.save(person);
            session.save(employee);
            session.save(owner);

        session.getTransaction().commit();
        session.close();

    }

}