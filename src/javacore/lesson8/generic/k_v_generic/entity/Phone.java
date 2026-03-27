package javacore.lesson8.generic.k_v_generic.entity;

public class Phone<K, V> extends MyMap<K, V> {

    public Phone(K key, V value) {
        super(key, value);
    }

    public V getPhoneNumber() {
        return super.getValue();
    }

    @Override
    public K getKey() {
        return super.getKey();
    }
}
