package Strings;

public class StringInternFunction {
    public static void main(String[] args) {
        String s1=new String("Hello");//1 copy in scp and written one copy outside the scp
        String s2="Hello";//maps for scp
        String s3=s1.intern(); //it will check whether the string is present in string pool or not
        System.out.println(s1==s3);//false(checking for memory address)
        System.out.println(s2==s3);//true
    }
}
