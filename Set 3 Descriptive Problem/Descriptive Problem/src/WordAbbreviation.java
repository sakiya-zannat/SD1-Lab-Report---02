
import java.util.Scanner;

public class WordAbbreviation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        if (word.length() > 10) {
            System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
        } else {
            System.out.println(word);
        }
    }

}
