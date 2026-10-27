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
  }
}
