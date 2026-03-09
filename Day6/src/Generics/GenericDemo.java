package Generics;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(); //this is a generic in java
        //list.add("Hello");
        list.add(10);
        //list.add(1.5);

        int x=(int)list.get(0);
        System.out.println(x);
    }
}
