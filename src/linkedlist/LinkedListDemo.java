package linkedlist;

/**
 *
 * @author mohammed
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(null);
        linkedList.addLast(new Node(10, null));
        linkedList.addLast(new Node(11, null));
        linkedList.addLast(new Node(12, null));
        linkedList.addLast(new Node(13, null));
        linkedList.addLast(new Node(14, null));
        linkedList.addLast(new Node(15, null));
        linkedList.add(new Node(0, null), 7);

        linkedList.display();
        System.out.println("");
        linkedList.delete(9);
        System.out.println(linkedList.size());
        linkedList.display();

    }

}
