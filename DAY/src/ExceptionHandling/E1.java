package ExceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println("InvalidIndex");
        }catch(Exception e) {
            System.out.println("Unknown Exception occurred");
        }finally{
            System.out.println("Unknown Exception Occurred!");
        }
    }
    static{
        System.out.println("hi this is me!");//can handle the exception before the main method
    }

}

