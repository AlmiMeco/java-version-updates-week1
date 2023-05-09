public class TreeApp {

    public static void main(String[] args) {


        MyTree tree = new MyTree();
        int[] numbers = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i < numbers.length; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("Pre-Order Traversal (Root-Left-Right)");
        tree.preOrderTraversal(tree.root);

    }

}
