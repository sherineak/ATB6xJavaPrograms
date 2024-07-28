package ex_23_CollectionFrameWorkSet;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab251 {
    public static void main(String[] args) {
        Queue pq1 = new PriorityQueue();
        //FIFO first in first out


        pq1.add("A");
        pq1.add("B");
        pq1.add("C");
        pq1.add("D");
        pq1.offer("E");  // Offer similar to Add

        //pq1.offer(null);  // Null is not supporting

        System.out.println(pq1.poll()); // remove first elements
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1);

        //Iterator used to print elements

        Iterator it = pq1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}
