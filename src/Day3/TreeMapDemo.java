package Day3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> mp= new TreeMap<>();
        mp.put(1,"earer");
        mp.put(3,"ef");
        mp.put(2,"af");
        mp.put(2,"sdada");
mp.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println();
TreeMap<Integer,String> mp2=new TreeMap<>((Integer o1,Integer o2)-> o2-o1);
        mp2.put(1,"earer");
        mp2.put(3,"ef");
        mp2.put(2,"af");
        mp2.put(2,"sdada");
        mp2.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println(mp.headMap(2));
        System.out.println(mp.tailMap(2));
        System.out.println(mp.subMap(1,3));
    }


}
