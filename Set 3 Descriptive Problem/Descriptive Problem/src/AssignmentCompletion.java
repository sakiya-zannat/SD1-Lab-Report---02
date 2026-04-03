
import java.util.Scanner;

public class AssignmentCompletion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting time = ");
        int start = sc.nextInt();

        if (start + 3 <= 10) {
            System.out.println("Yes,he can");
        } else {
            System.out.println("No,he can't.");
        }
    }
}
