import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // Arraylists<String> list2 = new Araaylists<String>;
        // Arraylists<Boolean> list3 = new Araaylists<Boolean>;
        list1.add(100);
        list1.add(2);
        list1.add(4);
        System.out.println(list1);
        System.out.println(list1.get(0));
        list1.add(2, 3);
        System.out.println(list1);

        list1.set(0, 222);
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);
    }
}