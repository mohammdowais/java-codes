// wap to add two matrices
public class MatixMultiplication {
    public static void main(String args[]) {
        // creating two matrices
        int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

        // creating another matrix to store the sum of two matrices
        int c[][] = new int[3][3]; // 3 rows and 3 columns

        // adding and printing addition of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();// new line
        }
    }
}
