package javaStudy.ch12;

public class EX12_3 {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("One", 1);
        System.out.println(p1.toString());

        Pair<Integer, String> p2 = new Pair<>(2, "Two");
        System.out.println(p2.toString());
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}
