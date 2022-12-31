public class MethodExample {
    public static void main(String[] args) {

        System.out.println("Executing the method for the first time.");
        myDetails();
        System.out.println("Executing the method for the second time.");
        myDetails();
        System.out.println("Executing the method for the third time.");
        myDetails();

    }
    public static void myDetails(){
        int myAge = 22;
        String myName = "G Madhu Sudan Reddy";
        System.out.println("My name is " + myName + " and my Age is  "+ myAge);
    }
}
