package Day2;

import java.util.PriorityQueue;

public class MinPriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        pq.add(4);
        pq.add(8);
        pq.add(13);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println("head of pq removed "+pq.peek());
            pq.poll();
        }
    }
}
