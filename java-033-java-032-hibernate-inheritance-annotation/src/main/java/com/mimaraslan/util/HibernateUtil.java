package com.mimaraslan.util;

import com.mimaraslan.entity.Employee;
import com.mimaraslan.entity.Owner;
import com.mimaraslan.entity.Person;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    static{

        try{
            Configuration configuration=new Configuration();
            configuration.configure();


            Properties settings = new Properties();

            // MYSQL 8
            settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            settings.put(Environment.URL, "jdbc:mysql://localhost:3306/companydb?useSSL=false");
            settings.put(Environment.USER, "root");
            settings.put(Environment.PASS, "123456789");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");

 /*               // PostgreSQL
                settings.put(Environment.DRIVER, "org.postgresql.Driver");
                settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres?currentSchema=companydb");
                settings.put(Environment.USER, "postgres");
                settings.put(Environment.PASS, "123456789");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL95Dialect");
*/

            settings.put(Environment.SHOW_SQL, "true");
            settings.put(Environment.FORMAT_SQL, "true");
            settings.put(Environment.HBM2DDL_AUTO, "create");
            settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

            configuration.setProperties(settings);

            configuration.addAnnotatedClass(Person.class);
            configuration.addAnnotatedClass(Owner.class);
            configuration.addAnnotatedClass(Employee.class);


            ServiceRegistry  serviceRegistry= new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            configuration.buildSessionFactory(serviceRegistry);

        }catch(Exception e){
            System.err.println("Hata: "+e);
        }

    }

    public static SessionFactory getSessionFactory(){
        return new Configuration().configure().buildSessionFactory();
    }

}