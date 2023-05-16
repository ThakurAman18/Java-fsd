package to.com;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedCircularLinkedList {
    Node head;

    public SortedCircularLinkedList() {
        this.head = null;
    }

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node current = head;
        Node prev = null;

        
        do {
            prev = current;
            current = current.next;

            if (data <= current.data || current == head) {
                // Insert the new node at the correct position
                prev.next = newNode;
                newNode.next = current;
                return;
            }
        } while (current != head);

        
        prev.next = newNode;
        newNode.next = head;
    }

    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class as6 {
    public static void main(String[] args) {
        SortedCircularLinkedList list = new SortedCircularLinkedList();

        list.insert(101);
        list.insert(2011);
        list.insert(303);
        list.insert(56);

        System.out.println("Sorted Circular Linked List:");
        list.display();
    }
}
