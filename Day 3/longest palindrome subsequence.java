import java.util.Scanner;
class LongestPalindromeSubsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String rev = "";
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
        
        

        

    }
    
}