package to.com;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public void insert(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void delete(int key) {
        if (head == null) {
            System.out.println("empty.");
            return;
        }
        
        if (head.data == key) {
            head = head.next;
            return;
        }
        
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        
        if (temp.next == null) {
            System.out.println("Key not found ");
        } else {
            temp.next = temp.next.next;
        }
    }
    
    public void display() {
        if (head == null) {
            System.out.println("empty.");
            return;
        }
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class delFisrtOccur {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        
        System.out.println("Original list:");
        list.display();
        
        int key = 30;
        list.delete(key);
        
        System.out.println("List after deleting " + key + ":");
        list.display();
    }
}
