package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;
import com.dxj.ffx.subject.tree.util.CreateTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145 后序遍历
 */
public class PostorderTraversal {
    private static final Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        PostorderTraversal postorderTraversal = new PostorderTraversal();

        List<Integer> integers = postorderTraversal.postorderTraversalRecursion(CreateTreeNode.createTreeNode(arr));
        List<Integer> integers2 = postorderTraversal.postorderTraversalIteration(CreateTreeNode.createTreeNode(arr));

        System.out.println(integers);
        System.out.println(integers2);
    }

    public List<Integer> postorderTraversalRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }

    public void traversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        traversal(root.left, res);
        traversal(root.right, res);
        res.add(root.val);
    }

    public List<Integer> postorderTraversalIteration(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pref = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            if (pop.right == null || pop.right == pref) {
                res.add(pop.val);
                pref = pop;
            }else {
                stack.push(pop);
                root = pop.right;
            }
        }
        return res;
    }

}
