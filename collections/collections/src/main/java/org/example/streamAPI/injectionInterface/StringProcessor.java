package org.example.streamAPI.injectionInterface;

public class StringProcessor {
    private StringOperation stringOperation;

    public void setStringOperation(StringOperation stringOperation) {
        this.stringOperation = stringOperation;
    }

    // Публичный метод для обработки строки, использующий внедренные операции
    public String process(String input) {
        stringOperation.checkLength(input);    // Проверка длины
        input = stringOperation.toUpperCase(input);    // Преобразование в верхний регистр
        return stringOperation.replaceCharacters(input, 'O', '0'); // Замена символов
    }
}
