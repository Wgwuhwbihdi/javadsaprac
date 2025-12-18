public class chatgptLL {
// This code is createdby chatgpt

        // Node class
        static class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        Node head;
    
        // 1. Insert at beginning
        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    
        // 2. Insert at end
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
    
            if (head == null) {
                head = newNode;
                return;
            }
    
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    
        // 3. Insert at specific position (1-based index)
        public void insertAtPosition(int data, int position) {
            if (position == 1) {
                insertAtStart(data);
                return;
            }
    
            Node newNode = new Node(data);
            Node temp = head;
    
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
    
            if (temp == null) {
                System.out.println("Position invalid");
                return;
            }
    
            newNode.next = temp.next;
            temp.next = newNode;
        }
    
        // 4. Delete from beginning
        public void deleteAtStart() {
            if (head == null) return;
            head = head.next;
        }
    
        // 5. Delete from end
        public void deleteAtEnd() {
            if (head == null || head.next == null) {
                head = null;
                return;
            }
    
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    
        // 6. Delete by value
        public void deleteByValue(int value) {
            if (head == null) return;
    
            if (head.data == value) {
                head = head.next;
                return;
            }
    
            Node temp = head;
            while (temp.next != null && temp.next.data != value) {
                temp = temp.next;
            }
    
            if (temp.next == null) {
                System.out.println("Value not found");
                return;
            }
    
            temp.next = temp.next.next;
        }
    
        // 7. Search element
        public boolean search(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key)
                    return true;
                temp = temp.next;
            }
            return false;
        }
    
        // 8. Count length
        public int length() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    
        // 9. Reverse linked list
        public void reverse() {
            Node prev = null;
            Node curr = head;
            Node next;
    
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    
        // 10. Display list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
        // Main method
        public static void main(String[] args) {
            chatgptLL list = new chatgptLL();
    
            list.insertAtEnd(10);
            list.insertAtEnd(20);
            list.insertAtEnd(30);
            list.insertAtStart(5);
            list.insertAtPosition(15, 3);
    
            list.display();
    
            list.deleteAtStart();
            list.deleteAtEnd();
            list.deleteByValue(20);
    
            list.display();
    
            System.out.println("Search 15: " + list.search(15));
            System.out.println("Length: " + list.length());
    
            list.reverse();
            list.display();
        }
    }

