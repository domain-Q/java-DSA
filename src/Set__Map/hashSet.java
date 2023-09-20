package Set__Map;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(6);
//        set.add(null);
//        set.add(9);
//        set.add(9);
//        System.out.println(set.size());
//
//        System.out.println(set);
//        set.remove(9);
//        System.out.println(set);
//        System.out.println(set.contains(3));
//        System.out.println(set.size());


        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(50);
        set1.add(30);
        set1.add(40);
        set1.add(60);

        System.out.println(set1.contains(30));
        System.out.println(set);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(500);
        set2.add(300);
        set2.add(400);
        set2.add(500);
        set2.add(600);
        System.out.println(set2);
    }
}
