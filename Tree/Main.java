// Define the node of the binary tree
class TreeNode {
    int data; // The value stored in the node
    TreeNode left; // Reference to the left child
    TreeNode right; // Reference to the right child

    // Constructor to initialize a new node with data
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Define the binary tree class
class BinaryTree {
    TreeNode root; // Root of the binary tree

    // Constructor to create an empty tree, initializing root to null
    public BinaryTree() {
        root = null;
    }

    // Method to create a sample tree manually
    public void createSampleTree() {
        root = new TreeNode(1); // Root node
        root.left = new TreeNode(2); // Left child of root
        root.right = new TreeNode(3); // Right child of root
        root.left.left = new TreeNode(4); // Left child of node 2
        root.left.right = new TreeNode(5); // Right child of node 2
    }

    // In-order traversal: left subtree -> node -> right subtree
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left); // Visit left subtree
            System.out.print(node.data + " "); // Visit the node
            inorderTraversal(node.right); // Visit right subtree
        }
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // Create a new binary tree
        tree.createSampleTree(); // Create a sample tree

        System.out.println("In-order traversal of the binary tree:");
        tree.inorderTraversal(tree.root); // Perform in-order traversal
    }
}
