package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Configuration
public class HumanConfig {

    @Bean
    @Scope(SCOPE_SINGLETON) //указать способ создания объекта
    public HumanService humanService(HumanDao humanDao) {
        return new HumanService(humanDao);
    }

    @Bean
    @Scope(SCOPE_SINGLETON)
    public HumanDao humanDao() {
        return new HumanDao();
    }
}
