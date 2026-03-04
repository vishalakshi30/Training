package Strings;

public class StringDemo {
    public static void main(String[] args) {
        String str="Hello";
        str.concat("world");//strings are immutable
        System.out.println(str);
        //correctly working with string
        str=str.concat( " world");
        System.out.println(str);
    }
}
