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
        System.out.println(root.value +" ,");
        inOrderTraversal(root.rigthChild);

    }




}
