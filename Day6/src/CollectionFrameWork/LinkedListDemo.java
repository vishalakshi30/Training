package CollectionFrameWork;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("start");
        list.addLast("end");
        System.out.println(list);


    }
}


/*
*features:
* maintains insertion order
* allows duplicates
* uses node structure internally-no indexes
* slower reading but faster insertion and deletions compared to array list
 */