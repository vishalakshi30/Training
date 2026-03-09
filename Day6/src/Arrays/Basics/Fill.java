package Arrays.Basics;
import java.util.Arrays;

public class Fill {

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 0};
        for(int i=1; i<=3; i++){
            arr[i]=5;
        }
        System.out.println(Arrays.toString(arr));
    }
}