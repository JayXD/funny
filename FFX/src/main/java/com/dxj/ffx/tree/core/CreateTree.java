package com.dxj.ffx.tree.core;

import com.dxj.ffx.tree.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CreateTree {

    public TreeNode process(Integer[] treeArray) {
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
            if (i > treeArray.length) {
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
