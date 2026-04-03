
import java.util.Scanner;

public class WeeklyWorkingHours {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Generally must work X hour = ");
        int X = sc.nextInt();
        System.out.print("Only Wednesday have to work for Y hours = ");
        int Y = sc.nextInt();

        int total = (4 * X) + Y;
        System.out.println("Total Hours = " + total);
    }
}
