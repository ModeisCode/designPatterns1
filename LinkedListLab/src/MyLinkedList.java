public class MyLinkedList {
    Node head;

    MyLinkedList(Object head_data) {
        head = new Node(head_data);
        head.next = null;
    }

    public void print(Node curr) {
        System.out.println("NODE_DATA:" + curr.data);
        if (curr.next == null)
            return;
        print(curr.next);
    }


    public void InsertToTail(Node new_node) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
    }
    public void printList(Object data) {
        Node curr = new Node(data);
        if (this.head == null) {
            System.out.println("List is empty!");
            return;
        }
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("");
    }

    public void deleteFromHead() {
        head = head.next;
    }

    public void deleteFromList(Object data) {
        Node node = head;
        while (node.next != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
                node = null;
                break;
            }
            node = node.next;
        }
    }

    public void deleteFromTail() {
        Node n = head;
        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;
    }

    public void update() {

    }
    public void fetch() {
    }
}
