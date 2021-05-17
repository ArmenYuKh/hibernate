package com.ex.jdbcandhibernate.ex_002_hibernate_intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
    public static void main(String[] args) {
        ClientsDetails details = new ClientsDetails();
        details.setAge(20);
        details.setId(3);
        details.setName("Vasiliy");
        details.setPhone("+79091234567");

        SessionFactory factory = new AnnotationConfiguration()
                .configure("com/ex/jdbcandhibernate/ex_002_hibernate_intro/hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(details);
        session.getTransaction().commit();
        session.close();
    }
}
