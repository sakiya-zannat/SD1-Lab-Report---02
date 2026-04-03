package intermediate;

public class CalculateAverageArray {

    public static void main(String[] args) {
        int[] arr = {10, 50, 100, 28, 30, 200};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("\nAverage = " + avg);
    }
}
