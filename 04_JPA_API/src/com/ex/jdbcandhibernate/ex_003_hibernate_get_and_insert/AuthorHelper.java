package com.ex.jdbcandhibernate.ex_003_hibernate_get_and_insert;

import com.ex.jdbcandhibernate.ex_003_hibernate_get_and_insert.entity.Author;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class AuthorHelper {

    private SessionFactory sessionFactory;

    public AuthorHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Author> getAuthorList() {
        // открыть сессию дял манипулцяции с персист. объектами
        Session session = sessionFactory.openSession();

        Criteria cb = session.createCriteria(Author.class); // не использовать session.createCriteria, т.к. deprecated

        List<Author> authorList = cb.list();

        session.close();

        return authorList;
    }

    public Author getAuthorById(long id) {
        Session session = sessionFactory.openSession();
        Author author = (Author) session.get(Author.class, id); // получение объекта по id
        session.close();
        return author;
    }

    public Author addAuthor(Author author){

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(author); // сгенерирует ID и вставит в объект

        session.getTransaction().commit();

        session.close();

        return author;

    }

}
