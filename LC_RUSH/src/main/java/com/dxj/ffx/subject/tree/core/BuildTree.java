package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;

import java.util.Arrays;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class BuildTree {

    public static void main(String[] args) {
        int[] left = new int[]{3, 9, 20, 15, 7};
        int[] right = new int[]{9, 3, 15, 20, 7};
        TreeNode treeNode = new BuildTree().buildTreeRubbish(left, right);
        System.out.println(treeNode);
    }


    /**
     * 没必要拷贝，新建一个带边界的递归方法。
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTreeRubbish(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        if (inorder.length == 1) {
            return new TreeNode(inorder[0]);
        }
        int root = preorder[0];
        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (root == inorder[i]) {
                rootIndex = i;
                break;
            }
        }
        TreeNode left = null;
        if (rootIndex != 0) {
            int[] preLeftTree = Arrays.copyOfRange(preorder, 1, rootIndex + 1);
            int[] inLeftTree = Arrays.copyOfRange(inorder, 0, rootIndex);
            left = buildTreeRubbish(preLeftTree, inLeftTree);
        }

        TreeNode right = null;
        if (rootIndex != inorder.length - 1) {
            int[] preRightTree = Arrays.copyOfRange(preorder, rootIndex + 1, inorder.length);
            int[] inRightTree = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);
            right = buildTreeRubbish(preRightTree, inRightTree);
        }

        TreeNode treeNode = new TreeNode(root);
        treeNode.left = left;
        treeNode.right = right;
        return treeNode;
    }

}
