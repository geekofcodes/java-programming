import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("arr[" +i+ "] :");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("The values of Array are:");
        for(int i=0; i<arr.length; i++){
            System.out.println("arr[" +i+ "] :" + arr[i]);
        }
    }
}
