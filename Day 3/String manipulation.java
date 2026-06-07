import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String pattern = sc.nextLine();
        char replacementChar = sc.next().charAt(0);

        String result = "";

        int i = 0;

        while(i <= word.length() - pattern.length()) {

            boolean match = true;

            for(int j = 0; j < pattern.length(); j++) {

                if(word.charAt(i+j) != pattern.charAt(j)) {

                    match = false;
                    break;
                }
            }

            if(match) {

                result += replacementChar;

                i = i + pattern.length();
            }
            else {

                result += word.charAt(i);

                i++;
            }
        }

        while(i < word.length()) {

            result += word.charAt(i);

            i++;
        }

        System.out.println(result);
    }
}