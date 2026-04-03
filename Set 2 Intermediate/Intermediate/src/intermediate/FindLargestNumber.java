package intermediate;

public class FindLargestNumber {

    public static void main(String[] args) {
        int[] arr = {10, 50, 100, 20, 600};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Number = " + max);
    }
}
