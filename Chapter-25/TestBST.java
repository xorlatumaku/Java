public class TestBST {
  public static void main(String[] args) {
    // Create a BST
    BST<String> tree = new BST<>();
    tree.insert("Albert Einstein");
    tree.insert("Isaac Newton");
    tree.insert("Charles Darwin");
    tree.insert("Alan Turing");
    tree.insert("Max Planck");
    tree.insert("Marie Curie");
    tree.insert("Jennifer Doudna");

    // Traverse tree
    System.out.print("Inorder (sorted): ");
    tree.inorder();

    System.out.print("\nPostorder: ");
    tree.postorder();

    System.out.print("\nPreorder: ");
    tree.preorder();

    System.out.print("\nThe number of nodes is " + tree.getSize());

    // Search for an element
    System.out.print("\nIs Albert Einstein in the tree? " + tree.search("Albert Einstein"));

    // Get a path from the root to Albert Einstein
    System.out.print("\nA path from the root to Albert Einstein is: ");
    java.util.ArrayList<BST.TreeNode<String>> path = tree.path("Albert Einstein");

    for (int i = 0; path != null && i < path.size(); i++)
      System.out.print(path.get(i).element + " ");

    Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
    BST<Integer> intTree = new BST<>(numbers);
    System.out.print("\nInorder (sorted): ");
    intTree.inorder();
  }
}
