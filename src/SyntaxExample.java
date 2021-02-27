import javafx.util.Pair;

import java.security.Key;
import java.util.ArrayList;




public class SyntaxExample {

    public static void main(String[] args) {
//        ArrayList<Integer>  myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);

        Pair1<Integer,String> p1 = new OrderPair<Integer,String>(1,"Apple");
        System.out.println(p1.getKey()+ " " +p1.getValue());
        SyntaxExample.print(1,"Prakash");


    }

    public static <K,V> void print(K a1,V b1){
        System.out.println("Key: " + a1);
        System.out.println("Value: "+ b1);
    }

    public static class OrderPair<K,V> implements Pair1<K,V> {
        private K key;
        private V value;

        public OrderPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }
    }



}
