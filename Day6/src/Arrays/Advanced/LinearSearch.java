package Arrays.Advanced;
public class LinearSearch {
    static void main(String[] args) {
        int[] arr={10,2,7,1,18,20,11,36};
        int target=11;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}