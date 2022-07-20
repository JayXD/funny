package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.TreeNode;
import com.dxj.ffx.subject.tree.util.CreateTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 104题
 * 二叉树最大深度
 */
public class MaxDepth {

    public static void main(String[] args) {
        TreeNode process = CreateTreeNode.createTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7});
        int i = new MaxDepth().maxDepthDFS(process);

        System.out.println(i);
    }

    public int maxDepthDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepthDFS(root.left), maxDepthDFS(root.right)) + 1;
    }


    public int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode poll = queue.poll();
                size = size - 1;
                if (poll == null) {
                    continue;
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
