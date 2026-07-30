import java.util.LinkedHashSet;

class LinkedHashSetMethods{

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(20);
        set.add(50);
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(20); // Duplicate

        System.out.println("LinkedHashSet : " + set); // linkedhashset : 20 50 10 40 30

        System.out.println("Contains 40 : " + set.contains(40)); // Contauns 40 : true

        set.remove(10); // 10 will be removed from set

        System.out.println("After Remove : " + set); // After remove : 20 50 40 30

        System.out.println("Size : " + set.size()); // size: 4
    }
}
