import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        int mySwitchValue;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value ranging between 1 to 5: ");
        mySwitchValue=sc.nextInt();

        switch(mySwitchValue){
            case 1:
                System.out.println("My value is 1.");
                break;
            case 2:
                System.out.println("My value is 2.");
                break;
            case 3:
                System.out.println("My value is 3.");
                break;
            case 4:
                System.out.println("My value is 4.");
                break;
            case 5:
                System.out.println("My value is 5.");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
