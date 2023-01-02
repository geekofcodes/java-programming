import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(3));
        cars.set(0, "Range Rover");
        System.out.println(cars);
        cars.add("Porsche");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        Collections.sort(cars);  // Sort cars
        System.out.println();
        System.out.println("List after Sorting:");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
