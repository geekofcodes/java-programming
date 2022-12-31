import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
        Printing 1 to n numbers using for loop
         */
        int n;
        System.out.print("Enter the number up to which you wish to see: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
