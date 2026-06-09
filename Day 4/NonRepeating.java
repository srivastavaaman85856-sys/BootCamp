import java.util.*;
public class NonRepeating{
    public static void main(String[] args){
        String str = "aabbccde";
        int freq[] = new int [256];
        for(int i=0;i<str.length();i++){
           freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                System.out.println("Non-repeating character is: " +str.charAt(i));
                break;
            }
        }

    }
    
}