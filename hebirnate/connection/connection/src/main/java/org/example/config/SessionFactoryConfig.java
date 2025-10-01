package org.example.config;

//import org.example.entity.Human;
import org.example.entity.Human;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import static org.hibernate.boot.SchemaAutoTooling.CREATE;
import static org.hibernate.boot.SchemaAutoTooling.VALIDATE;
import static org.hibernate.cfg.JdbcSettings.*;
import static org.hibernate.cfg.JdbcSettings.HIGHLIGHT_SQL;

public class SessionFactoryConfig {
    public static SessionFactory buildSessionFactoryConfig() {
        return   new Configuration()
                .addAnnotatedClass(Human.class)
                // use H2 in-memory database
                .setProperty(URL, "jdbc:postgresql://localhost:5432/learning")
                .setProperty(USER, "postgres")
                .setProperty(PASS, "password")
                // use Agroal connection pool
                .setProperty(AvailableSettings.JAKARTA_HBM2DDL_DATABASE_ACTION, VALIDATE)
                // display SQL in console
                .setProperty(SHOW_SQL, true)
                .setProperty(FORMAT_SQL, true)
                .setProperty(HIGHLIGHT_SQL, true)
                .buildSessionFactory();
    }
}
