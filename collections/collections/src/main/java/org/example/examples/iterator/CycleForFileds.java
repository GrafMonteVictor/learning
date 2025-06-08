package org.example.examples.iterator;

import java.lang.classfile.FieldElement;
import java.lang.reflect.Field;

public class CycleForFileds {
    public static void main(String[] args) {
//        for (Field field: new FieldElement(Contact)) {
//
//        }
    }

    class Contact {
        String name;
        int id;
        int number;

        public Contact(String name, int id, int number) {
            this.name = name;
            this.id = id;
            this.number = number;
        }
    }
}
