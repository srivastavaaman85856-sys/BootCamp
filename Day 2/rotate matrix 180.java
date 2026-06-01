import java.util.Scanner;

class Rotate180 {

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
        System.out.println("before rotation:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Rotated Matrix:");

        for(int i = row - 1; i >= 0; i--) {

            for(int j = col - 1; j >= 0; j--) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}