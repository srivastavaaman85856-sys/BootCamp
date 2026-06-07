import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char answer = '0';
        boolean found = false;

        for(int i = 0; i < str.length(); i++) {

            int count = 0;

            for(int j = 0; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {

                    count++;
                }
            }

            if(count == 1) {

                answer = str.charAt(i);
                found = true;
                break;
            }
        }

        if(found) {

            System.out.println(answer);
        }
        else {

            System.out.println("-1");
        }
    }
}