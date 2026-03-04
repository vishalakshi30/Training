package ExceptionHandling;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }

}
class Driver{
    static void vote(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age must be over 18");
        }
        System.out.println("you can vote!");
    }

    public static void main(String[] args) {
        try{
            vote(17);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}



/*
if i extend runtimeException it is handled by programmer so no need to write throw exception
but if i extend exception only it will be handled by JVM in that case we need to throws and exception that is created customly
 */