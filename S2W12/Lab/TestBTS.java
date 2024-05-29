package S2W12.Lab;

import java.util.ArrayList;

public class TestBTS {
    public static void main(String[] args) {

        int[] inputData = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        BTS<Integer> bts = new BTS<>();
        
        for(int i : inputData) {
            bts.insert(i);
        }
        
        System.out.print("Inorder (sorted): "); bts.inorder(bts.root); System.out.println();
        System.out.print("Postorder: "); bts.postorder(bts.root); System.out.println();
        System.out.print("Preorder: "); bts.preorder(bts.root); System.out.println();

        System.out.printf("Height of BST: %d\n", bts.height());
        System.out.printf("Root for BST is: %s\n", bts.getRoot().toString());
        System.out.printf("Check whether 10 is in the tree?: %s\n", bts.search(10));

        if (bts.delete(53)) System.out.println("Delete 53");
        System.out.print("Updated Inorder data (sorted): ");
        bts.inorder(bts.root);
        System.out.println();

        System.out.printf("Min Value: %s\n", bts.minValue().toString());
        System.out.printf("Max Value: %s\n", bts.maxValue().toString());

        System.out.print("A path from the root to 6 is: ");
        ArrayList<TreeNode<Integer>> path = bts.path(6);
        for (TreeNode<Integer> node: path) System.out.printf("%s ", node.element.toString());
        System.out.println();

    }
}
