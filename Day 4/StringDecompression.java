public class StringDecompression {
    public  static void main(String[] args){
        String str = "a3b2c4";

        String result = "";
        for(int i=0;i<str.length();i+= 2){
            char ch = str.charAt(i);
            int count = str.charAt(i + 1) - '0';

            for(int j=0;j< count ;j++){
                result += ch;
            }
        }
        System.out.println("String Deccompression is:" +result);
    }
    
}