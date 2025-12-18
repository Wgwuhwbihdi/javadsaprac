public class LLclass {

    // This code is created by me
    private Node head;
    private Node tail;
    private int size;

    public LLclass() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // insertfirst position value
    public void inserfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // insertLast poition value
    public void inserLast(int val) {
        if (tail == null) {
            inserLast(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // insertatmiddle position value
    public void inseratMiddle(int val, int index) {
        if (index == 0) {
            inserfirst(val);
            return;
        }
        if (index == size) {
            inserLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Delete first function
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // Deleteatlast function
    public int DeletelatElemnet() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondelast = get(size - 2);
        int val = tail.value;
        tail = secondelast;
        tail.next = null;
        return val;
    }

    // Delete at a perticular index
    public int deleteatperticularindex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return DeletelatElemnet();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    // it is used as a pointer
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Display function
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Find the value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;   // ✅ important line
        }
        return null;
    }
    

}
