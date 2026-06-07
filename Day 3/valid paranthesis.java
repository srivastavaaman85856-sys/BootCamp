import java.util.*;
class validparenthesis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        boolean valid = true;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='('){
                count ++;

            }
            else if(ch==')'){
                count--;
            }
            if(count<0){
                valid = false;
                break;
            }
            
        }
        if(count!=0){
            valid = false;
        }
        if(valid){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }

    }
}