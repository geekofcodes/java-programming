import java.util.Scanner;

public class WeightConvertor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in kilograms: ");
        double weightKgs = sc.nextDouble();
        convert(weightKgs);
    }

    public static void convert(double Kgs) {
        double weightGms, weightMg;
        weightGms = Kgs * 1000;
        weightMg = weightGms * 1000;
        System.out.println("The converted weight in grams is = " + weightGms);
        System.out.println("The converted weight in milligrams is = " + weightMg);

    }
}
