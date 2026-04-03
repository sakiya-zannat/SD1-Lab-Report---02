package intermediate;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100, 40, 65};
        Scanner sc = new Scanner(System.in);

         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");}
        System.out.print("\nEnter Number to Search: ");
        int key = sc.nextInt();                

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
