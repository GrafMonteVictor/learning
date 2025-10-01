package org.example;

import org.example.config.ObjectMapperConfig;
import org.example.dao.HumanDao;
import org.example.dto.Human;
import org.example.service.HumanService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
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
    }
}