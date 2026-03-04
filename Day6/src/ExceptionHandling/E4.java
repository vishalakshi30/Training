package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br=null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter something:");
            str=br.readLine();
            System.out.println("you entered:"+str);
        }finally{
            br.close();
        }

    }
}
