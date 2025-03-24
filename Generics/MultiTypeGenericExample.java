package Generics;

interface Generics<T>{
    void display(T value);
}

class Firstclass implements Generics<Integer>{
    public void display(Integer value){
        System.out.println(value);
    }
}

class SecondClass implements Generics<String>{
    public void display(String value){
        System.out.println(value);

    }
}
public class GenericInterface {
    public static void main(String[] args) {
        Generics<Integer> abc= new Firstclass();
        Generics<String> def= new SecondClass();
        abc.display(100);
        def.display("suha");
    }
}

//Important 

// // Generic Interface
// interface GenericInterface<T> {
//     void display(T value);
// }

// // Generic Class implementing Generic Interface
// class Display<T> implements GenericInterface<T> {
//     public void display(T value) {
//         System.out.println("Value: " + value);
//     }
// }

// public class GenericInterfaceExample {
//     public static void main(String[] args) {
//         GenericInterface<Integer> intObj = new Display<>();
//         intObj.display(200);

//         GenericInterface<String> strObj = new Display<>();
//         strObj.display("Java Generics");
//     }
// }



// Generic Interface with Two Type Parameters
interface Pair<K, V> {
    K getKey();

    V getValue();
}

// Generic Class Implementing Generic Interface
class KeyValuePair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MultiTypeGenericExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new KeyValuePair<>("Age", 25);
        System.out.println(pair1.getKey() + " : " + pair1.getValue());

        Pair<Integer, String> pair2 = new KeyValuePair<>(101, "Alice");
        System.out.println(pair2.getKey() + " : " + pair2.getValue());
    }
}
