import java.util.Scanner;
class diagonaaldifference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int D1=0;
        int D2=0;
        for(int i=0;i<n;i++){
            D1+=arr[i][i];
            D2+=arr[i][n-1-i];
        }
        System.out.println("the difference is:" + Math.abs(D1 - D2));
    }
}