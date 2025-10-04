package org.example.config;

import lombok.Getter;
import lombok.Setter;

import org.example.dto.Human;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import static org.hibernate.boot.SchemaAutoTooling.VALIDATE;
import static org.hibernate.cfg.AvailableSettings.*;

@Configuration
@ConfigurationProperties(prefix = "db")
@Setter
//@ConfigurationPropertiesScan
public class HebirnateConfig {
    @Value("${db.host}")
    private String host;
    private String user = "postgres";
    private String password = "password";

    @Bean
    public SessionFactory sessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .addAnnotatedClass(Human.class)
                .setProperty(URL, host)
                .setProperty(USER, user)
                .setProperty(PASS, password)
                // use Agroal connection pool
                .setProperty("hibernate.agroal.maxSize", 20)
                .setProperty(AvailableSettings.JAKARTA_HBM2DDL_DATABASE_ACTION, VALIDATE)
                .setProperty(SHOW_SQL, true)
                .setProperty(FORMAT_SQL, true)
                .setProperty(HIGHLIGHT_SQL, true)
                .buildSessionFactory();
    }
}
