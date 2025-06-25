package org.example.lambda.lambdas;

public class StringProcessor {
    private LengthChecker lengthChecker;
    private CharacterReplacer characterReplacer;
    private UpperCaseConverter upperCaseConverter;

    // Сеттеры для установки функциональных интерфейсов
    public void setLengthChecker(LengthChecker lengthChecker) {
        this.lengthChecker = lengthChecker;
    }

    public void setUpperCaseConverter(UpperCaseConverter upperCaseConverter) {
        this.upperCaseConverter = upperCaseConverter;
    }

    public void setCharacterReplacer(CharacterReplacer characterReplacer) {
        this.characterReplacer = characterReplacer;
    }

    // Основной метод, который выполняет все операции
    public String process(String input) {
        // Выполняем проверку длины
        if (lengthChecker != null) {
            lengthChecker.checkLength(input);
        } else {
            System.out.println("LengthChecker is not set!");
        }

        // Преобразуем строку в верхний регистр
        if (upperCaseConverter != null) {
            input = upperCaseConverter.toUpperCase(input);
        }

        // Заменяем символы
        if (characterReplacer != null) {
            input = characterReplacer.replaceCharacters(input, 'O', '0');
        }

        return input;  // Возвращаем результат после всех преобразований
    }
}
