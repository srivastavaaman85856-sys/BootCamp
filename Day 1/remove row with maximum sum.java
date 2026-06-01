import java.util.Scanner;

class RemoveMaxRow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[10][10];

        // Input matrix
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        int maxRow = 0;

        // Find row with maximum sum
        for(int i = 0; i < row; i++) {

            int sum = 0;

            for(int j = 0; j < col; j++) {

                sum += arr[i][j];
            }

            if(sum > maxSum || i == 0) {

                maxSum = sum;
                maxRow = i;
            }
        }

        // Delete that row
        for(int i = maxRow; i < row - 1; i++) {

            for(int j = 0; j < col; j++) {

                arr[i][j] = arr[i + 1][j];
            }
        }

        row--;

        System.out.println("Matrix after deleting max sum row:");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}