package chapter5_2;

public class BinaryTree {

    private TreeNode root;

    public TreeNode makeBinTree(TreeNode rootNode) {
        root = rootNode;
        root.left = null;
        root.right = null;

        return root;
    }

    public TreeNode insertLeftChildNodeBT(TreeNode parentNode, TreeNode element) {

        if (parentNode != null && parentNode.left == null) {
            parentNode.left = element;
            parentNode.left.left = null;
            parentNode.left.right = null;

            return parentNode.left;
        } else {
            return null;
        }
    }

    public TreeNode insertRightChildNodeBT(TreeNode parentNode, TreeNode element) {

        if (parentNode != null && parentNode.right == null) {
            parentNode.right = element;
            parentNode.right.left = null;
            parentNode.right.right = null;

            return parentNode.right;
        } else {
            return null;
        }
    }

    public TreeNode getRootNodeBT() {
        return root;
    }

    public TreeNode getLeftChildNodeBT(TreeNode node) {
        if (node != null) {
            return node.left;
        } else {
            return null;
        }
    }

    public TreeNode getRightChildNodeBT(TreeNode node) {
        if (node != null) {
            return node.right;
        } else {
            return null;
        }
    }

    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }

    public void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data);
        }
    }
}
