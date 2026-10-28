public class AVLTree<E> extends BST<E> {
  /* Create an empty AVL tree using a natural comparator */
  public AVLTree() {  // super() is implicitly called
  }

  /* Create a BST with a specified comparator */
  public AVLTree(java.util.Comparator<E> c) {
    super(c);
  }

  /* Create an AVL tree from an array of objects */
  public AVLTree(E[] objects) {
    super(objects);
  }

  @Override /* Override createNewNode to create an AVLTreeNode */
  protected AVLTreeNode<E> createNewNode(E e) {
    return new AVLTreeNode<E>(e);
  }
}
