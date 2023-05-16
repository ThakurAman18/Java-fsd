package to.com;

public class DoublyLinkedList {
    private Node head;

    private class Node {
        private int data;
        private Node previous;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }
    }

    public void traverseForward() {
        Node current = head;
        System.out.println("forward direction:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }

        System.out.println(" backward direction:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(4);

        dll.traverseForward();
        dll.traverseBackward();
    }
}
