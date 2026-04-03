
import java.util.Scanner;

public class WaterFilling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Bottle = ");
        int b1 = sc.nextInt();
        System.out.print("Second Bottle = ");
        int b2 = sc.nextInt();
        System.out.print("Third Bottle = ");
        int b3 = sc.nextInt();

        int empty = (b1 == 0 ? 1 : 0) + (b2 == 0 ? 1 : 0) + (b3 == 0 ? 1 : 0);

        if (empty >= 2) {
            System.out.println("Water Filling Time");
        } else {
            System.out.println("Not now");
        }
    }
}