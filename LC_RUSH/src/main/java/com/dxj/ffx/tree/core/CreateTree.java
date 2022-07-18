package com.dxj.ffx.tree.core;

import com.dxj.ffx.tree.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 从root开始逐层初始化二叉树
 * 需要先操作root、再操作root的左、右子节点。再操作子节点的左、右节点。
 * 先操作的节点后续不需要再操作，利用队列先进先出的特性。
 */
public class CreateTree {

    public static TreeNode process(Integer[] treeArray) {
        if (null == treeArray) {
            return null;
        }
        TreeNode root = new TreeNode(treeArray[0]);

        Queue<TreeNode> buildTree = new LinkedList<>();
        buildTree.add(root);

        for (int i = 1; i < treeArray.length; ) {
            TreeNode currentNode = buildTree.remove();

            Integer itemForLeft = treeArray[i];
            i++;
            if (null != itemForLeft) {
                currentNode.left = new TreeNode(itemForLeft);
                buildTree.add(currentNode.left);
            }
            if (i >= treeArray.length) {
                return root;
            }
            Integer itemForRight = treeArray[i];
            i++;
            if (null != itemForRight) {
                currentNode.right = new TreeNode(itemForRight);
                buildTree.add(currentNode.right);
            }
        }
        return root;
    }
}
