import java.util.Arrays;
class groupanagram{
    public static void main(String[] args){
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].length()==str[j].length()){
                    char[] a = str[i].toCharArray();
                    char[] b = str[j].toCharArray();
                    Arrays.sort(a);
                    Arrays.sort(b);
                    if(Arrays.equals(a, b)){
                        System.out.println(str[i]+" and "+str[j]);
                    }
                }
            }
        }    
    }
}