package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;

/**
 * 654. 最大二叉树
 */
public class ConstructMaximumBinaryTree {


    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 6, 0, 5};
        TreeNode treeNode = new ConstructMaximumBinaryTree().constructMaximumBinaryTree(arr);

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public int findMaxIndex(int[] nums, int begin, int end) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = begin; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int maxIndex = findMaxIndex(nums, left, right);

        TreeNode treeNode = new TreeNode(nums[maxIndex]);

        TreeNode leftTree = constructMaximumBinaryTree(nums, left, maxIndex - 1);
        TreeNode rightTree = constructMaximumBinaryTree(nums, maxIndex + 1, right);

        treeNode.left = leftTree;
        treeNode.right = rightTree;
        return treeNode;
    }

}
