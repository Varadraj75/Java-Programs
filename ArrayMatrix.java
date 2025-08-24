import java.util.Scanner;
import java.util.Arrays;

public class ArrayMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array and matrix
        System.out.print("Enter the size of the array (N): ");
        int N = sc.nextInt();

        // Validate the size of the matrix
        if (N <= 2 || N >= 10) {
            System.out.println("MATRIX SIZE OUT OF RANGE");
            return;
        }

        int[] a = new int[N];
        int[][] b = new int[N][N];

        // Input the elements of the single dimensional array
        System.out.println("Enter " + N + " positive integers for the single dimensional array:");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(a);

        // Display the sorted array
        System.out.print("SORTED ARRAY: ");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Fill the square matrix b[][]
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < N - i) {
                    b[i][j] = a[j];
                } else {
                    b[i][j] = a[N - i - 1];
                }
            }
        }

        // Display the matrix
        System.out.println("THE MATRIX IS:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
