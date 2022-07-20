package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;
import com.dxj.ffx.subject.tree.util.CreateTreeNode;

/**
 * 226 翻转二叉树
 */
public class InvertTree {
    private static final Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        TreeNode treeNode = CreateTreeNode.createTreeNode(arr);
        TreeNode treeNode1 = new InvertTree().invertTree(treeNode);
        System.out.println(treeNode1);
    }

    public TreeNode invertTree(TreeNode root) {
        traversal(root);
        return root;
    }


    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        TreeNode tempRight = root.right;
        TreeNode tempLeft = root.left;
        root.right = tempLeft;
        root.left = tempRight;
        System.out.println("left->right:" + tempLeft + "->" + tempRight);

        traversal(tempRight);
        traversal(tempLeft);
    }
}
