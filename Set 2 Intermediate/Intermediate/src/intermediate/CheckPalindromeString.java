package intermediate;

import java.util.Scanner;

public class CheckPalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s+", "").toLowerCase();

        StringBuilder rev = new StringBuilder(str);
        rev.reverse();

        if (str.equals(rev.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
