package org.example.collections;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Cat implements Comparable<Cat>{
    private int weight;
    private String name;
    private String nameSpecies;

    public Cat(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Cat(int weight, String name, String nameSpecies) {
        this.weight = weight;
        this.name = name;
        this.nameSpecies = nameSpecies;
    }

    @Override
    public String toString() {
        return "\nname: " + name + ", weight: " + weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //совпадают ли ссылки?
        if (o == null || getClass() != o.getClass()) return false; //объект - null или совпадают классы?
        Cat cat = (Cat) o; //автоупаковка объекта
        return weight == cat.weight && name.equals(cat.name); //проверка равенства полей
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareTo(o.getName());
    }
}
