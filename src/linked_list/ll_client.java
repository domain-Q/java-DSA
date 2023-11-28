package linked_list;

public class ll_client {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.AddFirst(50);
        ll.Display();
        ll.removeFirst();
        ll.Display();
        ll.removeLast();
        ll.Display();
        ll.AddLast(10);
        ll.Display();
        ll.AddAtIndex(5,1);
        ll.Display();

    }
}
