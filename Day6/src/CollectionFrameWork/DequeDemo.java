package CollectionFrameWork;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        System.out.println(dq);

    }
}
/*
*allows adding and removing from both sides
* faster than stack class which is slow
* can work like stack and queues
 */
