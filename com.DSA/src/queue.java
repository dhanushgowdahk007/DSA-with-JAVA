import java.util.*;

public class queue {
    public static void main(String[] args) {

//        Queue = FIFO Data Structure. First-In First-Out.
//                A collection designed for holding elements prior to processing Linear data Structure.
//        Contains : add()     ->  offer()
//                   remove()  ->  poll()
//                   element() ->  peek()
//                   contains(element) - returns ture or false
//                   isEmpty() - returns true or false
//                   size() - number of elements

        Queue<String> names = new LinkedList<>();

        names.offer("Dhanush");
        names.offer("Gowda");
        names.offer("Partha");
        names.offer("unknown");

//        System.out.println(names);
//        System.out.println(names.size());
//        System.out.println(names.isEmpty());
//        System.out.println(names.peek());
//        System.out.println(names.contains("Adviek"));
//        System.out.println(names.contains("Partha"));

        names.poll();
        names.poll();

        System.out.println(names);

//        Priority Queue =   A FIFO Data Structure that serves elements with the highest priorities first
//                           before elements with lower priority

        Queue<String> gpa = new PriorityQueue<>(Collections.reverseOrder());

        gpa.offer("A");
        gpa.offer("F");
        gpa.offer("D");
        gpa.offer("C");
        gpa.offer("B");

        while(!gpa.isEmpty()){
            System.out.println(gpa.poll());
        }
    }
}
