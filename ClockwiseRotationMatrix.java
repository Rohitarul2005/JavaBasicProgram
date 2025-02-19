import java.util.*;
  class ClockwiseRotationMatrix{
    public static void main(String[] args) {
        System.out.println("Enter the Matrix Value");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int row = 0, col = 0, prev = a[row][col], curr;
        int size = n;

        while (row < size && col < size) {
            if (row + 1 == size || col + 1 == size) break;

            prev = a[row][col];
            for (int i = row; i < size - 1; i++) {
                curr = a[i + 1][col];
                a[i][col] = curr;
            }

            for (int i = col; i < size - 1; i++) {
                curr = a[size - 1][i + 1];
                a[size - 1][i] = curr;
            }

            for (int i = size - 1; i > row; i--) {
                curr = a[i - 1][size - 1];
                a[i][size - 1] = curr;
            }

            for (int i = size - 1; i > col; i--) {
                curr = a[row][i - 1];
                a[row][i] = curr;
            }

            a[row][col + 1] = prev;

            row++;
            col++;
            size--;
        }

        System.out.println("Matrix After Shifting: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}