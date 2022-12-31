import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n , num, rem, sum = 0;
        System.out.print("Enter a number to check if it's Palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num = n;
        while(n!=0){
            rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if(sum == num)
            System.out.println("The Number is a Palindrome.");
        else
            System.out.println("The Number is not a Palindrome");
    }
}
