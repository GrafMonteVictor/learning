package org.example;

import org.example.config.HebirnateConfig;
import org.example.config.ObjectMapperConfig;
import org.example.dao.HumanDao;
import org.example.dto.Human;
import org.example.service.HumanService;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.util.Random;

@EnableAutoConfiguration
@ComponentScan
@EnableConfigurationProperties
public class Main {
    public static void main(String[] args) {
/*

        ApplicationContext context = new AnnotationConfigApplicationContext(
                HumanService.class, HumanDao.class, ObjectMapperConfig.class);

        HumanService humanService = context.getBean(HumanService.class);
        humanService.createHuman(
                Human.builder()
                        .id(new Random().nextLong())
                        .age(32)
                        .name("Victor")
                        .build()
        );
*/
        ApplicationContext context = new AnnotationConfigApplicationContext(
                HebirnateConfig.class
        );

        Human victor = Human.builder()
                .name("Victor")
                .age(32)
                .build();
        final Human[] newVictor = new Human[1];
        SessionFactory sessionFactory = context.getBean(SessionFactory.class);
        sessionFactory.inTransaction(
                session -> {
                    session.persist(victor);
                    victor.setAge(100);
                    newVictor[0] = session.find(Human.class, victor.getId());
                }
        );
        System.out.println(newVictor[0]);
    }
}