class Subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 6, 7, 8, 9};
        int maxlength = 1;
        int currentlength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentlength++;
                if (currentlength > maxlength) {
                    maxlength = currentlength;
                }
            } else {
                currentlength = 1;
            }
        }

        System.out.println("Length of the longest consecutive increasing subarray: " + maxlength);
    }
}