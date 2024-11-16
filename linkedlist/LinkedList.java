//Linked List Demo
public class LinkedList {
    
    //creating nested class for Nodes
    public static class Node {
        int data; //data
        Node next; //pointer (reference variable) points to next node

        //constructor
        public Node(int data) {
            this.data = data;
            this.next = null; //initially it points to null beacuase next element is not added
        }
    }

    //storing HEAD and TAIL
    public static Node head;
    public static Node tail;

    //Method to perform operations on Linked List
    public static void addFirst(int data) {
        //1. create new node
        Node newNode = new Node(data);
        
        //if our head is null then we have empty linked list then set head and tail
        if(head == null) {
            head = tail = newNode;
            return; //stop here
        }

        //2. set new node next to head
        newNode.next = head;

        //3. set new node as head
        head = newNode;
    }

    public static void addLast(int data) {
        //1. create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        //2. set tail next to newNode
        tail.next = newNode;

        //3. set tail as newNode
        tail = newNode;
    }

    public static void main(String[] args) {
        //create object of linked list
        LinkedList ll = new LinkedList();

        // ll.head = new Node(1); //storing head and creating new node
        // ll.head.next = new Node(2);

        addFirst(1);
        addFirst(2); 
        //It look like: (head) 2 -> 1 (tail)

        addLast(3);
        addLast(4);
        //It look like: (head) 2 -> 1 -> 3 -> 4 (tail)
    }
}