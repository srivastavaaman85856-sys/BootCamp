import java.util.*;
class longestsubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String longest = "";
        for(int i=0;i<str.length();i++){
            String temp="";
            for(int j=1;j<str.length();j++){
                char ch = str.charAt(j);
                boolean found = false;
                for(int k=0;k<temp.length();k++){
                    if(temp.charAt(k)== ch){
                        found = true;
                        break;
                    }
                }
                if(found){
                    break;
                }
                temp+=ch;
                if(temp.length()>longest.length()){
                    longest = temp;
                }
            }

        }
        System.out.println(longest);
    }
}