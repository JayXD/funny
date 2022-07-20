package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;

/**
 * 543题
 * 二叉树的直径
 */
public class DiameterOfBinaryTree {

    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return res;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;

        }
        int left = depth(root.left);
        int right = depth(root.right);
        res = Math.max(left + right, res);
        return Math.max(left, right) + 1;
    }
}
