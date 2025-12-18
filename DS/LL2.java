public class LL2 {

        // Head node of the linked list
        private Node head;   // points to the first node in the list
    
        // Tail node of the linked list
        private Node tail;   // points to the last node in the list
    
        // Number of nodes in the linked list
        private int size;    // keeps track of size, helps in O(1) size retrieval
    
        // Constructor
        public LL2() {
            this.size = 0;   // initially list is empty
        }
    
        // Inner Node class
        private class Node {
            private int value;  // value stored in this node
            private Node next;  // reference to the next node in the list
    
            // Node constructor for single value
            public Node(int value) {
                this.value = value;
                this.next = null; // next is null by default
            }
    
            // Node constructor with next pointer
            public Node(int value, Node next) {
                this.value = value;
                this.next = next; // directly connect to next node
            }
        }
    
        // Insert at the beginning of the list
        public void insertFirst(int val) {
            Node node = new Node(val);  // create a new node
            node.next = head;           // new node points to current head
            head = node;                // update head to new node
    
            if (tail == null) {         // if list was empty
                tail = head;            // tail also points to first node
            }
    
            size++;                     // increment size
        }
    
        // Insert at the end of the list
        public void insertLast(int val) {
            if (tail == null) {         // if list is empty
                insertFirst(val);       // reuse insertFirst to handle empty case
                return;
            }
    
            Node node = new Node(val);  // create new node
            tail.next = node;           // previous tail points to new node
            tail = node;                // update tail to new node
            size++;                     // increment size
        }
    
        // Insert at a specific index (0-based)
        public void insertAtMiddle(int val, int index) {
            if (index < 0 || index > size) {  // index validation
                throw new IndexOutOfBoundsException("Invalid index");
            }
    
            if (index == 0) {           // insert at head
                insertFirst(val);
                return;
            }
    
            if (index == size) {        // insert at tail
                insertLast(val);
                return;
            }
    
            Node temp = head;           // start from head
            for (int i = 1; i < index; i++) { // move to node before desired position
                temp = temp.next;
            }
    
            Node node = new Node(val, temp.next); // create node pointing to next
            temp.next = node;            // previous node points to new node
            size++;                      // increment size
        }
    
        // Delete first node
        public int deleteFirst() {
            if (head == null) {          // if list is empty
                throw new IllegalStateException("List is empty");
            }
    
            int val = head.value;        // store value to return
            head = head.next;            // update head to next node
    
            if (head == null) {          // if list became empty
                tail = null;             // tail must also be null
            }
    
            size--;                      // decrement size
            return val;                  // return deleted value
        }
    
        // Delete last node
        public int deleteLast() {
            if (size <= 1) {             // if 0 or 1 node
                return deleteFirst();    // reuse deleteFirst
            }
    
            Node secondLast = get(size - 2); // get node before tail
            int val = tail.value;        // store tail value
    
            tail = secondLast;           // update tail
            tail.next = null;            // remove reference to last node
            size--;                      // decrement size
            return val;                  // return deleted value
        }
    
        // Delete node at specific index
        public int deleteAtParticularIndex(int index) {
            if (index < 0 || index >= size) {  // index validation
                throw new IndexOutOfBoundsException("Invalid index");
            }
    
            if (index == 0) {            // delete head
                return deleteFirst();
            }
    
            if (index == size - 1) {     // delete tail
                return deleteLast();
            }
    
            Node prev = get(index - 1);  // get node before the one to delete
            int val = prev.next.value;   // store value to return
            prev.next = prev.next.next;  // bypass the deleted node
            size--;                      // decrement size
            return val;                  // return deleted value
        }
    
        // Get node at a specific index (0-based)
        public Node get(int index) {
            if (index < 0 || index >= size) {  // index validation
                throw new IndexOutOfBoundsException("Invalid index");
            }
    
            Node node = head;            // start at head
            for (int i = 0; i < index; i++) {
                node = node.next;        // move node forward
            }
            return node;                 // return node at index
        }
    
        // Display all elements
        public void display() {
            Node temp = head;            // start from head
            while (temp != null) {       // traverse until null
                System.out.print(temp.value + " -> "); // print value
                temp = temp.next;        // move to next node
            }
            System.out.println("null");  // indicate end of list
        }
    
        // Find a node by value
        public Node find(int value) {
            Node node = head;            // start at head
            while (node != null) {       // traverse list
                if (node.value == value) {  // value found
                    return node;            // return node
                }
                node = node.next;        // move to next node
            }
            return null;                 // value not found
        }
    
        // Return size of the list
        public int size() {
            return size;                 // return number of nodes
        }
    }
    

