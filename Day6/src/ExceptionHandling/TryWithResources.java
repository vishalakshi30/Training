package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws Exception{
        String str;
        try( BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("enter something:");
            str=br.readLine();
            System.out.println("you entered!" +str);

        }
    }
}
