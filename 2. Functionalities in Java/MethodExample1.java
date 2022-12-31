import java.util.Scanner;

public class MethodExample1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String student_name = sc.nextLine();
        System.out.print("Enter " + student_name + "'s score: ");
        int student_score = sc.nextInt();
        char student_division = calculateStudentDivision(student_score);

        displayRank(student_name, student_division);
    }

    public static void displayRank(String name, char division) {
        System.out.println(name + " has secured " + division + " division");

    }

    public static char calculateStudentDivision(int student_score) {
        char division;
        if (student_score >= 80) {
            division = 'A';
            return division;
        } else if (student_score < 80 && student_score >= 60) {
            division = 'B';
            return division;
        } else if (student_score < 60 && student_score >= 40) {
            division = 'C';
            return division;
        } else if (student_score < 40) {
            division = 'F';
            return division;
        }
        return 0;
    }
}
