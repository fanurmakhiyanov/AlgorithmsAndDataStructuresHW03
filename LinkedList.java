
class LinkedList {
    static Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(77);
        list.head.next = new Node(13);
        list.head.next.next = new Node(10);
        list.head.next.next.next = new Node(-40);
        list.head.next.next.next.next = new Node(-99);

        System.out.println("Искомый List");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Перевернутый List ");
        list.printList(head);
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }
    }
}
