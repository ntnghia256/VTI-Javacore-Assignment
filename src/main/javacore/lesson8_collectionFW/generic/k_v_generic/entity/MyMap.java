package main.javacore.lesson8_collectionFW.generic.k_v_generic.entity;

public class MyMap<K, V> {
    private K key;
    private V value;

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }
}
