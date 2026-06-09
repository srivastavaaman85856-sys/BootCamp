import java.util.*;
class permutation{
    public static void main(String[] args){
        String str = "abc";
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("the permutation is:");
        do{
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }while(nextPermutation(arr));
    
    }        
}
