public class IfElseStatements {
    public static void main(String[] args) {

        int studentMarks = 95;

        if(studentMarks == 100) {
            System.out.println("The Student scored S Grade.");
        } else if (studentMarks > 90 && studentMarks <100 ){
            System.out.println("The Student scored A Grade.");
        } else if (studentMarks > 80 && studentMarks <90 ){
            System.out.println("The Student scored B Grade.");
        } else if (studentMarks > 70 && studentMarks <80 ){
            System.out.println("The Student scored C Grade.");
        } else if (studentMarks > 60 && studentMarks <70 ){
            System.out.println("The Student scored D Grade.");
        } else if (studentMarks > 50 && studentMarks <60 ){
            System.out.println("The Student scored E Grade.");
        } else{
            System.out.println("The Student has Failed.");
        }

    }

}
