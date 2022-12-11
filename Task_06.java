import java.util.ArrayList;
import java.util.List;

/**
 * Task_06
 */
public class Task_06 {

    public static void main(String[] args) {
        Character value = null;
        //List<Character> list1 = List.of('M', 'a', 'x', 'i', 'm');
        List<Character> list1 = new ArrayList<Character>();
        list1.add('M');
        list1.add('a');
        list1.add('x');
        list1.add('i');
        list1.add('m');
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);

        List<Character> list2 = List.copyOf(list1);
        //list2.add(3, 'i');
        System.out.println(list2);
    }
}
