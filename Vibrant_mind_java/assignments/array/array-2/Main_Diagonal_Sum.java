import java.util.Scanner;

public class Main_Diagonal_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Enter Matrix Elements:");

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Sum of Main Diagonal = " + sum);

        sc.close();
    }
}