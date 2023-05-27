public class TreeApp {

    public static void main(String[] args) {


        MyTree tree = new MyTree();
        int[] numbers = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i < numbers.length; i++) {
            tree.insert(numbers[i]);
        }

        /* Visualizing Our Tree*/
        VisualizeTree.printTree(tree.root, null, false);


        /* Traversal Methods for parsing Trees */
        System.out.println("Pre-Order Traversal (Root-Left-Right)");
        tree.preOrderTraversal(tree.root);

        System.out.println();
        System.out.println("------------------------------");

        System.out.println("In-Order Traversal (Left-Root-Right) (Ascending Order *if BST*)");
        tree.inOrderTraversal(tree.root);

        System.out.println();
        System.out.println("------------------------------");

        System.out.println("Post-Order Traversal (Left-Right-Root) *root last*");
        tree.postOrderTraversal(tree.root);

        System.out.println();
        System.out.println("------------------------------");

        System.out.println("Breadth-Order Traversal (Level-By-Level) *left->right*");
        tree.breadthTraversal(tree.root);
    }

}
