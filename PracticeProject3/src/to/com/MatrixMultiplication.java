package to.com;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {10, 20, 30},
            {43, 54, 65},
            {71, 85, 93}
        };

        int[][] matrix2 = {
            {101, 110},
            {123, 131},
            {145, 153}
        };

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("Resultant matrix:");
        printMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
