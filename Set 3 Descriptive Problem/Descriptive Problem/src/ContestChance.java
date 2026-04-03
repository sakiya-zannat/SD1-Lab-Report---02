
import java.util.Scanner;

public class ContestChance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Prepared topics(A,B,C): ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.print("Enter the given topics(X): ");
        int X = sc.nextInt();

        System.out.println("\n-----Result-----");
        System.out.println("Prepared topics:" + A + ", " + B + ", " + C);
        System.out.println("Given topic: " + X);
        if (X == A || X == B || X == C) {
            System.out.println("Yes,he has a chance to win!");
        } else {
            System.out.println("No, he can't win.");
        }
    }
}
