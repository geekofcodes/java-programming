import java.util.Scanner;

public class MultiplicationExample {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number to view its multiplication table: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(number + " x " + i + " = " + number*i );
        }
    }
}
