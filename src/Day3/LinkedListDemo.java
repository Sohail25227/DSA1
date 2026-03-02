package Day3;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(19);
        linkedList.addLast(20);
        linkedList.addLast(12);

        linkedList.forEach((Integer val)-> System.out.print(" "+val));
        System.out.println();
        LinkedList<Integer> linkedList2=new LinkedList<>();
        linkedList2.add(0,12);
        linkedList2.add(1,13);
        linkedList2.add(2,14);
        System.out.println(linkedList2.getFirst());
        linkedList2.forEach((Integer val)-> System.out.print(" "+val));
    }
}
