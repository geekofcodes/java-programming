import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);
        num.add(5);
        System.out.println(num);
        num.add(1,34);
        System.out.println(num);
        Collections.sort(num);
        System.out.println("List after being sorted:");
        for (int i : num) {
            System.out.println(i);
        }
    }
}
