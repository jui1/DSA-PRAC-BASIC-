import java.util.*;

public class Spiralmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        
        // Input the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

       
        while (top <= bottom && left <= right) {
            
            

        }

        sc.close();
    }
}