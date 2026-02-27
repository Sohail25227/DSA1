package Day1;

import java.util.*;
//Collection is a part of jcf but collections is utility class which  provide static methods for operation on collection
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(1);
        l1.add(5);
        System.out.println("original list"+l1);
        System.out.println("max value:" + Collections.max(l1));
        System.out.println("min value:" + Collections.min(l1));
        Collections.sort(l1);
        System.out.println("sorted list " + l1);
        Collections.reverse(l1);
        System.out.println("Reverse list" + l1);

    }
}
