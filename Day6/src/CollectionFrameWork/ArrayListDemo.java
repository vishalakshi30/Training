package CollectionFrameWork;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);

        System.out.println("ArrayList:"+list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains(30));
        System.out.println(list.remove(2));
        System.out.println("ArrayList after removing:"+list);

        for(int i:list){
            System.out.println(i +" ");
        }

    }
}
/*
Features
*Maintains insertion order
*Allows Duplicates
*Dynamic size
*index based access
*fast for reading elements
 */
