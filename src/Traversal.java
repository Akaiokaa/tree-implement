public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10, null, null);
    root.left = new TreeNode(9, null, null);
    root.left.left = new TreeNode(5, null, null);
    root.left.right = new TreeNode(2, null, null);

    root.right = new TreeNode(15, null, null);
    root.right.left = new TreeNode(-3, null, null);
    root.right.right = new TreeNode(5, null, null);
    root.right.right.right = new TreeNode(22, null, null);

    System.out.println();

    System.out.print("pre-order: ");
    preOrder(root);
    System.out.println();
    System.out.print("post-order: ");
    postOrder(root);
    System.out.println();
    System.out.print("in-order: ");
    inOrder(root);
  }
  
  //Print a tree rooted at a given node in pre-order
  public static void preOrder(TreeNode node){
    if (node == null) return; 
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  //Print a tree rooted at a given node in pre-order
  public static void postOrder(TreeNode node){
    if (node == null) return; 
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }

  //Print a tree rooted at a given node in pre-order
  public static void inOrder(TreeNode node){
    if (node == null) return; 
    postOrder(node.left);
    System.out.print(node.value + " ");
    postOrder(node.right);
  }
}
