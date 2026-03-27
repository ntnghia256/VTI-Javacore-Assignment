package javacore.lesson8.generic.k_v_generic.entity;

public class Staff<K extends Number, V> extends MyMap<K, V> {

    public Staff(K id, V name) {
        super(id, name);
    }

    public K getId() {
        return super.getKey();
    }

    public V getName() {
        return super.getValue();
    }
}
