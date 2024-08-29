import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Apple");
        l.add("Bananna");
        l.add("Orange");
        l.remove(1);
        System.out.println(); 
        System.out.println("ArrayList= " + l);

        List<String> l1 = new LinkedList<String>();
        l1.add("Car");
        l1.add("Bike");
        l1.add("Bus");
        l1.remove("Bike");
        System.out.println("Linked List= " + l1);

        Stack<String> l2 = new Stack<String>();
        l2.push("Book1");
        l2.push("Book2");
        l2.push("Book3");
        l2.pop();
        System.out.println("Stack= " + l2);

        Queue<Integer> q1 = new PriorityQueue<Integer>();
        q1.add(10);
        q1.add(20);
        q1.add(15);
        // q1.remove(10);
        System.out.println("PriorityQueue= " + q1);

        Set<String> s1 = new HashSet<String>();
        s1.add("Red");
        s1.add("Green");
        s1.add("Blue");
        s1.remove("Green");
        System.out.println("HashSet= " + s1);

        Set<String> s2 = new TreeSet<String>();
        s2.add("Ganesh");
        s2.add("Dinesh");
        s2.add("Avinesh");
        System.out.println(s2);
        s2.remove("Ganesh");
        System.out.println("TreeSet= " + s2);

        ArrayDeque<String> q2 = new ArrayDeque<String>();
        q2.add("One");
        q2.add("Two");
        q2.add("Three");
        q2.remove("One");
        System.out.println("ArrayDeque= " + q2);

        LinkedHashSet<String> s3 = new LinkedHashSet<String>();
        s3.add("Sun");
        s3.add("Moon");
        s3.add("Star");
        System.out.println("LinkedHashSet= " + s3);

        List<String> l3 = new ArrayList<String>();
        l3.add("Java");
        l3.add("Python");
        l3.add("C++");
        Iterator<String> itr = l3.iterator();
        System.out.println("ArrayList");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
