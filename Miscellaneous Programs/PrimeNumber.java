import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        int num;
        System.out.print("Enter the number to check if it's Prime or not: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        isprime(num);
    }

    public static void isprime(int n) {
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0)
                count = count + 1;
        }
        if (count == 2)
            System.out.println(n + " Is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }
}
