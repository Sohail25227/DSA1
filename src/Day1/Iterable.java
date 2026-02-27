package Day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args){
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        Iterator<Integer> it=l1.iterator();
        while(it.hasNext())
        {
            int val =it.next();
            if(val==3){
                System.out.println("Removing 3");
                it.remove();
            }
            System.out.println(val);
        }
        System.out.println("After Removal");
        for(int val : l1){
            System.out.println(val);
        }
    }
}