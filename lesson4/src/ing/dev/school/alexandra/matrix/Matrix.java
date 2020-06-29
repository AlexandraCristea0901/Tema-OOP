package ing.dev.school.alexandra.matrix;

public class Matrix {

    public static void main(String[] args) {
        displayMatrix();
    }

    public static int[][] displayMatrix () {
        int[][] matrix = new int[15][15];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
}
