public class TestAVLTree {
  public static void main(String[] args) {
    // Create an AVL tree
    AVLTree<Integer> tree = new AVLTree<Integer>(new Integer[]{25, 20, 5});
    
    System.out.print("After inserting 25, 20, 5:");
    printTree(tree);

    tree.insert(34);
    tree.insert(50);

    System.out.print("\nAfter inserting 34, 50:");
    printTree(tree);
  }
}
