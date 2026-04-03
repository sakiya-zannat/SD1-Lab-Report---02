
import java.util.Scanner;

public class MoreThan50_PercentPassed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Section number, X = ");
        int X = sc.nextInt();
        System.out.print("Student Number, Y = ");
        int Y = sc.nextInt();
        System.out.print("Student Passed, Z = ");
        int Z = sc.nextInt();

        int total = X * Y;

        if (Z > total / 2) {
            System.out.println("Yes,greater than 50%");
        } else {
            System.out.println("Not greater than 50%");
        }
    }
}
