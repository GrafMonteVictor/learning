package org.example.examples.set;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
class Cat {
    private int weight;
    private String name;

    public Cat(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name + ",\nweight: " + weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && name.equals(cat.name);
    }
}
