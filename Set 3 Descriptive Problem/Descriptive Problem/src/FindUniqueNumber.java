
import java.util.Scanner;

public class FindUniqueNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        if (a == b) {
            System.out.println("unique number, c = " + c);
        } else if (a == c) {
            System.out.println("unique number, b = " + b);
        } else {
            System.out.println("unique number, a = " + a);
        }
    }
}
