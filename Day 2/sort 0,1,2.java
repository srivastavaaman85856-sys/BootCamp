import java.util.Scanner;

class Sort012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        
        for(int i = 0; i < n; i++) {

            if(arr[i] == 0)
                count0++;

            else if(arr[i] == 1)
                count1++;

            else
                count2++;
        }

        int i = 0;

        while(count0-- > 0) {
            arr[i++] = 0;
        }

        while(count1-- > 0) {
            arr[i++] = 1;
        }

        while(count2-- > 0) {
            arr[i++] = 2;
        }

        System.out.println("Sorted Array:");

        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}