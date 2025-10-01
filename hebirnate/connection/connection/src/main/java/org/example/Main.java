package org.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.config.SessionFactoryConfig;
import org.example.entity.Human;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import static org.hibernate.cfg.AvailableSettings.*;
import static org.hibernate.tool.schema.Action.CREATE;

public class Main {
    public static void main(String[] args) {
        //подключение к БД
        SessionFactory sessionFactory = SessionFactoryConfig.buildSessionFactoryConfig();

        Human victor = Human.builder()
                .id(23L)
                .name("Victor")
                .age(45)
                .build();

        //выполнять транзакции в сессии можем так
        sessionFactory.inTransaction(
                session -> {
//                    session.persist(victor);
//                    victor.setAge(43);
                    session.merge(victor);
//                    session.detach(victor); // в БД сущность вставляется
//                    session.clear(); //контект очищается, но в БД сущность вставляется
//                    session.remove(victor); //необходимо указать id
                    System.out.println();
                }
        );



//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning");
//        // persist an entity
//        sessionFactory.inTransaction(session -> {
//            session.persist(
//                    new Human("3", "Hibernate in Action")
////                    new Book("123", "")
//            );
//        });

        // query data using HQL
//        sessionFactory.inSession(session -> {
//            out.println(session.createSelectionQuery("select isbn||': '||title from Book").getSingleResult());
//        });

        // query data using criteria API
//        sessionFactory.inSession(session -> {
//            var builder = sessionFactory.getCriteriaBuilder();
//            var query = builder.createQuery(String.class);
//            var book = query.from(Book.class);
//            query.select(builder.concat(builder.concat(book.get(Book_.isbn), builder.literal(": ")),
//                    book.get(Book_.title)));
//            out.println(session.createSelectionQuery(query).getSingleResult());
//        });
    }
}