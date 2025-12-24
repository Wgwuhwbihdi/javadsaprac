public class DLL2 {
    public static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;

    public void insertAtbeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = head;
        }
    }
    
    public void insertAtinPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("invalid positon");
            return;
        }
        if (position == 1) {
            insertAtbeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i <= position - 1 && temp.next == null; i++) {
            temp = temp.next;
        }
        if (temp == null && temp.next == null) {
            insertAtEnd(data);
        } else {
            Node newNode = new Node(position);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
        
    }

    // Display function 
    public void display(){
        if(head==null){
      System.out.println("list is empty");
      return;
        }
        Node temp = head;
        System.out.println("Null <->");
        while(temp!=null){
            System.out.println(temp.value);
            temp= temp.next;
        }
        System.out.println("");
    }
    public void dislayBackwared(){
        if(tail==null){
          System.out.println("list is empty");
          return;
        }
     Node temp = tail;
     System.out.println("Null");
            while(temp!=null){
               System.out.println(temp.value);
               temp=temp.prev;
            }
            System.out.println("");
    }
}
