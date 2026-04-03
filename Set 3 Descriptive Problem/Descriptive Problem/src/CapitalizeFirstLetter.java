
import java.util.Scanner;

public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        System.out.println(result);
    }
}
