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
      else  // element matches current.element
        return true;  // Element is found
    }

    return false;
  }

  @Override /* Insert element e into the binary tree
  * Return true if the element is inserted successfully */
  public boolean insert(E e) {
    if (root == null)
      root = createNewNode(e); // Create a new root
    else {
      // Locate the parent node
      TreeNode<E> parent = null;
      TreeNode<E> current = root;
      while (current != null)
        if (c.compare(e, current.element) < 0) {
          parent = current;
          current = current.left;
        }
        else if (c.compare(e, current.element) > 0) {
          parent = current;
          current = current.right;
        }
        else
          return false;  // Duplicate node not inserted

      // Create the new node and attach it to the parent node
      if (c.compare(e, parent.element) < 0)
        parent.left = createNewNode(e);
      else
        parent.right = createNewNode(e);
    }

    size++;
    return true; // Element inserted successfully
  }

  protected TreeNode<E> createNewNode(E e) {
    return new TreeNode<>(e);
  }
}
