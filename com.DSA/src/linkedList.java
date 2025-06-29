import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
//        LinkedList = Nodes are in 2 parts (data+address)
//                     Nodes are in non-consecutive memory locations
//                     Elements are linked using pointers

        //    advantages?
        //    1. Dynamic Data Structure (allocates needed memory while running)
        //    2. Insertion and Deletion of Nodes is easy. O(1)
        //    3. No/Low memory waste

        //    disadvantages?
        //    1. Greater memory usage (additional pointer)
        //    2. No random access of elements (no index [i])
        //    3. Accessing/searching elements is more time consuming. O(n)

        //    uses?
        //    1. implement Stacks/Queues
        //    2. GPS navigation
        //    3. music playlist

        LinkedList<String> ll = new LinkedList<>();

        // LinkedList as a Stack
//        ll.push("A");
//        ll.push("B");
//        ll.push("C");
//        ll.push("D");
//        ll.push("F");
//
//        ll.pop();

        // LinkedList as Queue
        ll.offer("A");
        ll.offer("B");
        ll.offer("C");
        ll.offer("D");
        ll.offer("F");
//        ll.poll();
//        System.out.println(ll.peek());

//        ll.add(4, "E"); // adds new element at particular index
//        ll.remove("E");

//        System.out.println(ll.indexOf("D"));


//        ll.offerFirst("0");
//        ll.offerLast("G");

//        ll.pollFirst();
//        ll.pollLast();
//
//        ll.pollFirst();
//        ll.pollLast();
//
//        System.out.println(ll.peekFirst());
//        System.out.println(ll.peekLast());

        System.out.println(ll);
    }
}
