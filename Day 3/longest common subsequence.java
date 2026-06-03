import java.util.*;
class LCS{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String result = "";
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            for(int j=0;j<s2.length();j++){
                if(ch==s2.charAt(j)){
                    result = result + ch;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}