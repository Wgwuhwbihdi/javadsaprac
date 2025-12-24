import java.util.LinkedList;
import java.util.Queue;

public class Btree {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node root;

    void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }

  void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    void preorder(Node root){
     if(root==null) return;
        System.out.print(root.data+"");
          preorder(root.left);
          preorder(root.right);
    }

    public static void main(String[] args) {
        Btree tree = new Btree();
 tree.insert(1);
 tree.insert(2);
 tree.insert(3);
 tree.insert(4);
 tree.insert(5);
 tree.insert(6);
 tree.insert(7);
 System.out.println("inpoorder values");
 tree.inorder(tree.root);
 System.out.println("\npreorder values");
 tree.preorder(tree.root);
    
}
}