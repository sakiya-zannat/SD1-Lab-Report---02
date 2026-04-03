
import java.util.Scanner;

public class NotebookCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of pulp(in kg),N = ");
        int N = sc.nextInt();

        int notebooks = N * 10;

        System.out.println("\n _____Notebooks production Details_____");
        System.out.println("Pulp received: " + N + " kg");
        System.out.println("Notebooks produced: " + notebooks + " pieces");
    }
}
