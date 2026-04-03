
import java.util.Scanner;

public class MonopolyCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter profits of companies A, B, C, D (in lakh):  ");
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();

        System.out.println("\n-----Market Monopoly Check-----");
        System.out.println("Profits: A = " + P + "lakh, B = " + Q + "lakh, C = " + R + "lakh, S = " + S+"lakh");
        if (P > Q + R + S || Q > P + R + S || R > P + Q + S || S > P + Q + R) {
            System.out.println("Yes, there is a monopoly in the market!");
        } else {
            System.out.println("No, there is no monopoly in the market.");
        }
    }
}
