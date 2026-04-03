package descriptive.problem;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int A = sc.nextInt();
        System.out.print("C = ");
        int C = sc.nextInt();

        if ((A + C) % 2 == 0) {
            int B = (A + C) / 2;
            System.out.println("Average, B = " + B);
        } else {
            System.out.println("No integer B Exists");
        }
    }

}
