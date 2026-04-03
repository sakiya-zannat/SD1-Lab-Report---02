
import java.util.Scanner;

public class CheckAvgGreaterOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int A = sc.nextInt();
        System.out.print("B = ");
        int B = sc.nextInt();
        System.out.print("C = ");
        int C = sc.nextInt();

        double avg = (A + B) / 2.0;

        if (avg > C) {
            System.out.println("Yes,Greater than C");
        } else {
            System.out.println("Not Greater than C");
        }

    }
}
