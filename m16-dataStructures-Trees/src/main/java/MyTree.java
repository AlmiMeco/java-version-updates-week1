import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }


    void insert(int value) {
        TNode newNode = new TNode(value);

        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rigthChild == null) {
                    current.rigthChild = newNode;
                    break;
                }
                current = current.rigthChild;
            }
        }
    }


    void preOrderTraversal(TNode root){

        if (root==null) return; // termination

        System.out.print(root.value +", "); // visit root
        preOrderTraversal(root.leftChild); // visit left subtree
        preOrderTraversal(root.rigthChild); // visit right subtree


    }


    void inOrderTraversal(TNode root){

        if (root==null) return;

        inOrderTraversal(root.leftChild);
        System.out.print(root.value +", ");
        inOrderTraversal(root.rigthChild);

    }

    void postOrderTraversal(TNode root){

        if (root==null) return;

        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rigthChild);
        System.out.print(root.value +", ");
    }


//    Level-By-Level Traversal
    void breadthTraversal(TNode root){

        if (root==null)return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rigthChild != null) queue.add(toVisit.rigthChild);
        }



    }


}
