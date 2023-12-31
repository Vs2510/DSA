import java.util.Scanner;

class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){
        this.data=data;
          left=null;
          right=null;
    }
 
}
public class binaryTree {


    static Node create(){
        Node root=null;
        int data;
        Scanner sc =new Scanner(System.in);
       
        System.out.println("Enter data: ");
         data = sc.nextInt();
        if (data == -1)
             return null;
              
    
        root = new Node(data);
        System.out.print("Enter left child of : " + root.data);
        root.left=create();
        System.out.print("Enter right child of : " + root.data);
        root.right=create();
        return root;
    }
    static  void inorder(Node root) {
        // left root right
    if (root == null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data);
    inorder(root.right);
    }

    static  void preorder(Node root) {
        // root left right
    if (root == null){
        return;
    }
    System.out.print(root.data);
    inorder(root.left);
    inorder(root.right);
    }
    static  void postorder(Node root) {
        // left right root
    if (root == null){
        return;
    }
    inorder(root.left);
    
    inorder(root.right);
    
    System.out.print(root.data);
    }
    

    
    public static void main(String[] args) {
        Node root=create();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
    
}
