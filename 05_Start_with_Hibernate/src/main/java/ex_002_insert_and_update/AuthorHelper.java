package ex_002_insert_and_update;

import ex_002_insert_and_update.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class AuthorHelper {

    private SessionFactory sessionFactory;

    public AuthorHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Author> getAuthorList() {
        // открыть сессию дял манипулцяции с персист. объектами
        Session session = sessionFactory.openSession();

        // этап подготовки запросов для Criteria API

        // объект-конструктор запросов для Criteria API
        CriteriaBuilder cb = session.getCriteriaBuilder(); // не использовать session.createCriteria, т.к. deprecated

        CriteriaQuery cq = cb.createQuery(Author.class);

        Root<Author> root = cq.from(Author.class); // первостепенный, корневой entity (в sql запросе - from)

        cq.select(root); // необязательный оператор, если просто нужно получить все значения


        // этап выполнения запроса
        Query query = session.createQuery(cq);

        List<Author> authorList = query.getResultList();

        session.close();

        return authorList;
    }

    public Author getAuthorById(long id) {
        Session session = sessionFactory.openSession();
        Author author = session.get(Author.class, id); // получение объекта по id
        session.close();
        return author;
    }

    public Author addAuthor(Author author){

        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Author author1 = session.get(Author.class, 2L);
//
//        author1.setName("Alexander");
//        author1.setLastName("Pushkin");


//        Author author1 = session.get(Author.class, 6L);
//
//        author1.setName("Nikolay");
//        author1.setLastName("Gogol");


//        Author author1 = session.get(Author.class, 6L);
//
//        author1.setName("Nikolay");
//        author1.setLastName("Gogol");

//        session.save(author1); // сгенерирует ID и вставит в объект

        for (int i = 0; i < 20000; i++) {
            session.save(new Author("name " + i));

            if (i % 20 == 0) {
                session.flush();
            }

        }

        session.getTransaction().commit();

        session.close();

        return author;

    }

}
