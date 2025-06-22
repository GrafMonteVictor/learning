package org.example.examples.map.putGetHashMap;

public class Key {

    String key;

    Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return key.charAt(0);
    }

    @Override
    public boolean equals(Object obj) {
        Key keyObj = (Key) obj;
        return keyObj.key.equals(key);
    }


}
