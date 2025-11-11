package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class example {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq=new PriorityQueue<>();


        PriorityQueue<Integer> pq_max=new PriorityQueue<>(Comparator.reverseOrder());
        pq_max.add(10);
        pq_max.add(20);
        pq_max.add(1);
        pq_max.add(100);

        System.out.println(pq_max.peek());
        pq_max.poll();
        System.out.println(pq_max.peek());



    }

}
