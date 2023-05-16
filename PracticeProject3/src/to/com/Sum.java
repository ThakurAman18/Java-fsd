package to.com;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the range (L and R): ");
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        int sum = calculateSum(arr, L, R);
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);

        scanner.close();
    }

    public static int calculateSum(int[] arr, int L, int R) {
        int sum = 0;

        if (L < 0 || L >= arr.length || R < 0 || R >= arr.length) {
            System.out.println("Invalid range.");
            return sum;
        }

        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
