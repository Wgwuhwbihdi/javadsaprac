public class pracLL {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insertAtBeginning(int data){
        if(head==null){
            head=new Node(data);
            inserAtEnd(data);
            return;
        }
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    
    public void inserAtEnd(int data){
         Node newNode = new Node(data);
         if(head==null){
            head=newNode;
            return;
         }
         else{
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
         }

    }
    public void display(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print("-> "+currentNode.data);
            currentNode=currentNode.next;
        }
    }
     public void inserAtindex(int index,int data){
         Node lastputNode = head;
        if(index==0){
            insertAtBeginning(data);
        }else if(lastputNode==null){
            inserAtEnd(data);
        }
        else{
            Node newNode = new Node(data);
            Node currentNode=head;
            for(int i=0;i<index-1;i++){
                currentNode=currentNode.next;

            }
            newNode.next=currentNode.next;
            currentNode.next=newNode;
        }
     }

    public static void main(String[] args) {
        pracLL list = new pracLL();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.inserAtEnd(1000);
        list.inserAtindex(2, 200);
        list.inserAtindex(4, 200);
        list.inserAtindex(9, 500);
        list.display();
    }
}