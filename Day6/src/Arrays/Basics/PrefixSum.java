package Arrays.Basics;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int[] prefix = new int[arr.length];

        // Base case
        prefix[0] = arr[0];

        // Prefix sum formula
        for (int i = 1; i <arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print prefix array
        for (int i = 0; i <arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        //prefix sum over
        int L=1;
        int R=3;

        int sum;

        sum=prefix[R]-prefix[L-1]; //01
        System.out.println();
        System.out.println("sum of range between index 1 to 3:" +sum);

    }
}
