package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94 中序遍历
 */
public class InorderTraversal {

    public List<Integer> inorderTraversalRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }

    public void traversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        traversal(root.left, res);
        res.add(root.val);
        traversal(root.right, res);
    }

    public List<Integer> inorderTraversalIteration(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
