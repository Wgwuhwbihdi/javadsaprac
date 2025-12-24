public class DLL {

   public class Node{
      int data;
      Node next;
      Node prev;
      public Node(int data){
         this.data = data;
         this.next=null;
         this.prev = null;
      }
   }
   Node head;
   Node tail;

   public void insertatbignning(int val){
      Node newNode = new Node(val);
      if(head == null){
           head =newNode;
           tail = newNode;
         return;
      }else{
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
      }
   }

   public void insertAtEnd(int data){
     Node newNode = new Node(data);
     if(head==null && tail==null){
      insertatbignning(data);
     }else{
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
     }
}

// insert at center 
public void insertAtcenter(int data){
      Node newNode = new Node(data);

}

   public void display(){
      System.out.print("null <-> ");
      Node temp = head;
      while(temp!=null){
         System.out.print(temp.data+" <-> ");
         temp=temp.next;
      }
      System.out.print("null");
   }


   public static void main(String[] args) {
      DLL dll = new DLL();
        dll.insertatbignning(100);
       dll.insertAtEnd(101);
       dll.insertatbignning(99);
      dll.display();
   }
}