
import java.util.Scanner;

public class CandyPackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of children: ");
        int N = sc.nextInt();

        System.out.print("Enter number of candies already available: ");
        int X = sc.nextInt();

        int need = Math.max(0, N - X);
        int packets = (need + 3) / 4;

        System.out.println("\n -----Candy Distribution-----");
        System.out.println("Children: " + N);
        System.out.println("Available candies: " + X);
        System.out.println("Packets to buy: " + packets);
    }
}
