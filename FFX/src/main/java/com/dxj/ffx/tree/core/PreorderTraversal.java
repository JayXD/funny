package com.dxj.ffx.tree.core;

import com.dxj.ffx.tree.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

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
    public void preorderTraversalIteration(){

    }

}
