package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 114
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 */
public class Flatten {

    public void flatten(TreeNode root) {
        List<TreeNode> treeNodes = new ArrayList<>();
        traversal(root, treeNodes);

        for (int i = 0; i < treeNodes.size() - 1; i++) {
            TreeNode cur = treeNodes.get(i);
            cur.left = null;
            cur.right = treeNodes.get(i + 1);
        }
    }

    private void traversal(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        traversal(root.left, list);
        traversal(root.right, list);
    }
}
