package org.example.streamAPI.lambdas;

@FunctionalInterface
public interface CharacterReplacer {
    String replaceCharacters(String input, char oldChar, char newChar);
    //дефолтный метод для примера
    default String replaceCharacters2(String input, char oldChar, char newChar){
        return "";
    };
}
