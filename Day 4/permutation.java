import java.util.*;
public class permutation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("the permutation is:");
        do{
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            


    }
    
}
