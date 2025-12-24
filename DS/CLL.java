public class CLL {
  private static class Node{
    private int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
  }    
  private Node head;
  private Node tail;

  public void insertAtbeginnig(int data){
     Node newNode = new Node(data);
     if(head==null){
        head = newNode;
        tail = newNode;
        newNode.next = head;
     }else{
        newNode.next = head;
        head = newNode;
        tail.next = head;
     }
  }
  public void display(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    System.out.print("HEAD <->");
    do{
      System.out.print(temp.data+"->");
      temp = temp.next;
    }while(temp!=head);
    System.out.println("HEAD");
  }
  public static void main(String[] args) {
    CLL list = new CLL();
    list.insertAtbeginnig(10);
    list.insertAtbeginnig(20);
    list.insertAtbeginnig(30);
    list.insertAtbeginnig(40);
    list.display();
  }
}
