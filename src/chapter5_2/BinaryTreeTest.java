package chapter5_2;

public class BinaryTreeTest {

    public static void main(String[] args) {

        TreeNode<String> nodeA = new TreeNode();
        TreeNode<String> nodeB = new TreeNode();
        TreeNode<String> nodeC = new TreeNode();
        TreeNode<String> nodeD = new TreeNode();
        TreeNode<String> nodeE = new TreeNode();
        TreeNode<String> nodeF = new TreeNode();
        TreeNode<String> nodeG = new TreeNode();
        TreeNode<String> nodeH = new TreeNode();
        TreeNode<String> nodeI = new TreeNode();
        TreeNode<String> nodeJ = new TreeNode();
        TreeNode<String> nodeK = new TreeNode();
        TreeNode<String> nodeL = new TreeNode();
        TreeNode<String> nodeM = new TreeNode();

        BinaryTree binaryTree = new BinaryTree();

        nodeA.data = "A";
        nodeA = binaryTree.makeBinTree(nodeA);

        if (nodeA != null) {
            nodeB.data = "B";
            nodeB = binaryTree.insertLeftChildNodeBT(nodeA, nodeB);
            nodeC.data = "C";
            nodeC = binaryTree.insertRightChildNodeBT(nodeA, nodeC);
        }

        if (nodeB != null) {
            nodeD.data = "D";
            nodeD = binaryTree.insertLeftChildNodeBT(nodeB, nodeD);
            nodeE.data = "E";
            nodeE = binaryTree.insertRightChildNodeBT(nodeB, nodeE);
        }

        if (nodeC != null) {
            nodeF.data = "F";
            nodeF = binaryTree.insertLeftChildNodeBT(nodeC, nodeF);
            nodeG.data = "G";
            nodeG = binaryTree.insertRightChildNodeBT(nodeC, nodeG);
        }

        if (nodeD != null) {
            nodeH.data = "H";
            nodeH = binaryTree.insertLeftChildNodeBT(nodeD, nodeH);
            nodeI.data = "I";
            nodeI = binaryTree.insertRightChildNodeBT(nodeD, nodeI);
        }

        if (nodeE != null) {
            nodeJ.data = "J";
            nodeJ = binaryTree.insertLeftChildNodeBT(nodeE, nodeJ);
        }

        if (nodeF != null) {
            nodeK.data = "K";
            nodeK = binaryTree.insertRightChildNodeBT(nodeF, nodeK);
        }

        if (nodeG != null) {
            nodeL.data = "L";
            nodeL = binaryTree.insertLeftChildNodeBT(nodeG, nodeL);
            nodeM.data = "M";
            nodeM = binaryTree.insertRightChildNodeBT(nodeG, nodeM);
        }

        System.out.printf("\n\nPreorder : ");
        binaryTree.preorder(nodeA);
        System.out.printf("\n\nInorder : ");
        binaryTree.inorder(nodeA);
        System.out.printf("\n\nPostorder : ");
        binaryTree.postorder(nodeA);
    }
}
