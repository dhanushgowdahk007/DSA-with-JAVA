import java.util.Stack;

public class stack {
    public static void main(String[] args) {

//        stack = LIFO Data Structure. Last-In First-out.
//        Operations : push() to add element to the top
//                     pop() to remove element from the top
//                     peek() used to access the top element at top without removing
//                     search(element) return +ve integer 1 to top most element if exits. if not returns -1.
//                     empty() returns true no element is found or else returns false.

        Stack<String> names = new Stack<>();

        System.out.println(names.empty());

        names.push("Dhanush");
        names.push("Gowda");
        names.push("Unknown");
        names.push("Partha");

        System.out.println(names);

        names.pop();

        System.out.println(names);

        System.out.println(names.peek());

        System.out.println(names.search("Gowda"));
    }
}