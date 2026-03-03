package Day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> mp= new LinkedHashMap<>();
        mp.put(2, "One");
        mp.put(1, "Two");
        mp.put(3, "Three");

        mp.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        Map<Integer,String> mp2= new LinkedHashMap<>(16,.75F,true);

        mp2.put(4, "Four");
        mp2.put(5, "Five");
        mp2.put(6, "Six");

        mp2.get(5);
        mp2.forEach((key,value)->System.out.println("Key: " + key + ", Value: " + value));

    }
}
