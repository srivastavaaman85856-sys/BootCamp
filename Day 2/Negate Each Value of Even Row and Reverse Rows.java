import java.util.Scanner;

class NegateReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        // Input matrix
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Negate even rows
        for(int i = 0; i < row; i += 2) {

            for(int j = 0; j < col; j++) {

                arr[i][j] = -arr[i][j];
            }
        }

        System.out.println("Output Matrix:");

        // Reverse rows while printing
        for(int i = row - 1; i >= 0; i--) {

            for(int j = 0; j < col; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}