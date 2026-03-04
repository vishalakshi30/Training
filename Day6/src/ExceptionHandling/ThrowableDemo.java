package ExceptionHandling;

public class ThrowableDemo {
    static void function() throws Throwable{
        throw new Throwable("something went wrong");
    }
    public static void main(String[] args)throws Throwable {
        //try{
        //    function();
        //}catch(Throwable t){
        //    System.out.println(t.getMessage());
        function();
        }

    }

/*
Throe new Exception("Error")
throw new RuntimeException("Message")
throw New Throwable("Message")

Not Allowed:X
throw new String X


*/