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

  /* Create a binary tree from an array of objects */
  public BST(E[] objects) {
    this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

  @Override /* Return true if the element is in the tree */
  public boolean search(E e) {
    TreeNode<E> current = root; // Start from the root
    
    while (current != null) {
      if (c.compare(e, current.element) < 0) {
        current = current.left;
      }
      else if (c.compare(e, current.element) > 0) {
        current = current.right;
      }
    }
  }
}
