package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;
import com.dxj.ffx.subject.tree.util.CreateTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144题
 * 前序遍历
 */
public class PreorderTraversal {
    private static final Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {

        TreeNode process = CreateTreeNode.createTreeNode(arr);

        List<Integer> res1 = PreorderTraversal.getObject().preorderTraversalRecursion(process);
        List<Integer> res2 = PreorderTraversal.getObject().preorderTraversalIteration(process);

        System.out.println(res1);
        System.out.println(res2);
    }

    public static PreorderTraversal getObject() {
        return new PreorderTraversal();
    }

    /**
     * 递归
     */
    public List<Integer> preorderTraversalRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }

    private void traversal(TreeNode treeNode, List<Integer> res) {
        if (treeNode == null) {
            return;
        }
        res.add(treeNode.val);
        traversal(treeNode.left, res);
        traversal(treeNode.right, res);
    }


    /**
     * 迭代
     */
    public List<Integer> preorderTraversalIteration(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            root = pop.right;
        }
        return res;
    }

}
