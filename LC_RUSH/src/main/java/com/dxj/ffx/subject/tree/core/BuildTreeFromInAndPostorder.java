package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 */
public class BuildTreeFromInAndPostorder {

    public static void main(String[] args) {
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};
        BuildTreeFromInAndPostorder buildTreeFromInAndPostorder = new BuildTreeFromInAndPostorder();
        buildTreeFromInAndPostorder.buildTree(inorder, postorder);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        int postorderLength = postorder.length;
        int inorderLength = inorder.length;

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorderLength; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTree(inorder, postorder, indexMap, 0, inorderLength - 1, 0, postorderLength - 1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, Map<Integer, Integer> indexMap, int inLeft, int inRight, int postLeft, int postRight) {
        if (inLeft > inRight) {
            return null;
        }
        int rootValue = postorder[postRight];
        Integer rootIndex = indexMap.get(rootValue);

        TreeNode rootNode = new TreeNode(rootValue);

        TreeNode leftNode = buildTree(inorder, postorder, indexMap, inLeft, rootIndex - 1, postLeft, postLeft + rootIndex - inLeft - 1);
        TreeNode rightNode = buildTree(inorder, postorder, indexMap, rootIndex + 1, inRight, postLeft + rootIndex - inLeft, postRight - 1);
        rootNode.left = leftNode;
        rootNode.right = rightNode;
        return rootNode;
    }
}
