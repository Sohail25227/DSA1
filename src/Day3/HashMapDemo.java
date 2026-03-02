package Day3;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
      Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        System.out.println("HashMap size: " + map.size());
        System.out.println("Value for 'apple': " + map.get("apple"));

        for(Map.Entry<String,Integer> mp: map.entrySet())
        {
            int value = mp.getValue();
            String key = mp.getKey();

            System.out.println("Key: " + key + ", Value: " + value);
        }
        map.putIfAbsent("date", 4);
        map.putIfAbsent("cherry", 31);
        map.put( "banana", 43);
        System.out.println("After CHANGE");

        for(Map.Entry<String,Integer> mp: map.entrySet())
        {
            int value = mp.getValue();
            String key = mp.getKey();

            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
