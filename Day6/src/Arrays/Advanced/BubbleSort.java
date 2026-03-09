package Arrays.Advanced;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {8,8,7,6,5,4};
        bubbleSort(numbers);
        System.out.println("\nSorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
