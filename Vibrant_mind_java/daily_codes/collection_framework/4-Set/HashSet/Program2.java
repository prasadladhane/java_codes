import java.util.*;
class HashSetMethodsDemo {

    public static void main(String[] args) {

        // 1. Creating HashSet
        HashSet<String> technologies = new HashSet<>();

        // 2. add()
        technologies.add("Java");
        technologies.add("Spring");
        technologies.add("MySQL");
        technologies.add("Hibernate");
        technologies.add("Java");   // Duplicate (ignored)

        System.out.println("HashSet : " + technologies); 

        // 3. size()
        System.out.println("Size : " + technologies.size()); //4

        // 4. contains()
        System.out.println("Contains Java? " + technologies.contains("Java")); // True
        System.out.println("Contains Python? " + technologies.contains("Python")); // false

        // 5. remove()
        technologies.remove("Hibernate");
        System.out.println("After Removing Hibernate : " + technologies);

        // 6. isEmpty()
        System.out.println("Is Empty? " + technologies.isEmpty()); //false

        // 7. iterator()
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = technologies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next()); // all elements will print
        }

        // 8. Enhanced for loop
        System.out.println("\nUsing For-each:");
        for (String tech : technologies) {
            System.out.println(tech); // all elements will print
        }

        // 9. clone()
        HashSet<String> copy = (HashSet<String>) technologies.clone();
        System.out.println("\nCloned Set : " + copy);

        // 10. toArray()
        Object[] arr = technologies.toArray(); // Hashset will convert to array

        System.out.println("\nArray Elements:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // 11. clear()
        technologies.clear();
        System.out.println("\nAfter clear() : " + technologies);

        // 12. isEmpty() after clear
        System.out.println("Is Empty? " + technologies.isEmpty());
    }
}
