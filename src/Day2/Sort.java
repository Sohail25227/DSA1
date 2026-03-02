package Day2;

import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(23);
        arr.add(231);
        arr.add(5);
        arr.add(2);
        System.out.println("Original Array");
        System.out.println(arr);
        arr.sort(null);
        System.out.println("Ascending Order");
        System.out.println(arr);
        arr.sort((Integer a, Integer b)-> b-a);
        System.out.println("Descending Order");
        System.out.println(arr);
        arr.forEach((Integer val)-> System.out.println(val));
        arr.replaceAll((Integer val)-> -1*val);
        arr.forEach((Integer val)-> System.out.println(val));

    }
}
