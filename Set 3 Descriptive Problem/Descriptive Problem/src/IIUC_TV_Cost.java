
import java.util.Scanner;

public class IIUC_TV_Cost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A group of N friends, N = ");
        int N = sc.nextInt();
        System.out.print("one IIUC-TV subscription is X Taka, X = ");
        int X = sc.nextInt();

        int subs = (N + 5) / 6;
        System.out.println("Total Cost = " + subs * X);
    }
}
