package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class BuildTreeFromPreAndInOrder {

    public static void main(String[] args) {
        int[] left = new int[]{3, 9, 20, 15, 7};
        int[] right = new int[]{9, 3, 15, 20, 7};
        TreeNode treeNode = new BuildTreeFromPreAndInOrder().buildTree(left, right);
        System.out.println(treeNode);
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, indexMap, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, Map<Integer, Integer> indexMap, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight) {
            return null;
        }

        int rootVal = preorder[preLeft];
        int rootIndex = indexMap.get(rootVal);

        TreeNode left = buildTree(preorder, inorder, indexMap, preLeft + 1, preLeft + rootIndex - inLeft, inLeft, rootIndex - 1);
        TreeNode right = buildTree(preorder, inorder, indexMap, preLeft + rootIndex - inLeft + 1, preRight, rootIndex + 1, inRight);

        TreeNode root = new TreeNode(rootVal);
        root.left = left;
        root.right = right;
        return root;
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
