public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(1);
        Node node1 = new Node(2);
        ll.head.next = node1;
        Node node2 = new Node(3);
        node1.next = node2;
      //ll.print(ll.head);
        ll.InsertToTail(new Node(4));
        ll.InsertToTail(new Node(5));
        ll.deleteFromHead();
        ll.deleteFromTail();
        ll.print(ll.head);
    }
}