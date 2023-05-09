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


    }





}
