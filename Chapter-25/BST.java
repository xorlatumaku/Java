public class BST<E> implements Tree<E> {
  protected TreeNode<E> root;
  protected int size = 0;
  protected java.util.Comparator<E> c;

  /* Create a default BST with a natural order Comparator */
  public BST() {
    this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
  }

  /* Create a BST with a specified comparator */
  public BST(java.util.Comparator<E> c) {
    this.c = c;
  }
}
