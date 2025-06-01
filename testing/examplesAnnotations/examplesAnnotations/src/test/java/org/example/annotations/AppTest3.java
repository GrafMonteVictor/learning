package org.example.annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Имя теста 3")
public class AppTest3 {
    @Test
    @DisplayName("Проверка входных данных")
    void inputData() {
    }

    @DisplayName("Проверка критических ситуаций") @Test
    void criticalCases() {
    }
}
