import java.util.*;
class minimumwindow{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String min ="";
        int minlength =999;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = "";
                for(int k=i;k<=j;k++){
                    sub +=s.charAt(k);
                }
                boolean A= false;
                boolean B = false;
                boolean C = false;
                for(int k=0;k<sub.length();k++){
                    if(sub.charAt(k)=='A'){
                        A = true;
                    }
                    if(sub.charAt(k)=='B'){
                        B = true;
                    }
                    if(sub.charAt(k)=='C'){
                        C = true;
                    }
                }
                if(A&&B&&C){
                    if(sub.length()<minlength){
                        min=sub;
                        minlength = sub.length();
                    }
                }
                
            }
        }
        System.out.println(min);
    }

}