import java.util.Scanner;

public class RotationString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        char dir = sc.nextLine().charAt(0);

        int len = s.length();
        n = n % len;

        String result;

        if (dir == 'L' || dir == 'l') {

            String moved = s.substring(n);
            String remaining = s.substring(0, n);

            result = moved.substring(0, n).toUpperCase()
                    + moved.substring(n)
                    + remaining;

        } else {

            String moved = s.substring(len - n);
            String remaining = s.substring(0, len - n);

            result = moved.toUpperCase() + remaining;
        }

        System.out.println(result);
    }
}