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

    tree.insert(30);
    System.out.print("\nAfter inserting 30");
    printTree(tree);

    tree.insert(10);
    System.out.print("\nAfter inserting 10");
    printTree(tree);

    tree.delete(34);
    tree.delete(30);
    tree.delete(50);
    System.out.print("\nAfter removing 34, 30, 50:");
    printTree(tree);
  }
}
