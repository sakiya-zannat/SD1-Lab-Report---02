
import java.util.Scanner;

public class TemperatureAgreement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter minimum temperature Alice wants (A): ");
        int A = sc.nextInt();

        System.out.println("Enter maximum temperature Bob wants (B): ");
        int B = sc.nextInt();

        System.out.println("Enter minimum temperature Charlie wants (C): ");
        int C = sc.nextInt();

        System.out.println("\n -----Temperature Agreement check----");
        System.out.println("Alice wants at least: " + A + "°");
        System.out.println("Bob wants at most: " + B + "°");
        System.out.println("Charlie wants at least: " + C + "°");

        if (Math.max(A, C) <= B) {
            System.out.println("Yes,they can all agree on some temperature!");
        } else {
            System.out.println("No,they can't all agree on a temperature.");
        }

    }
}
