package com.dxj.ffx.subject.tree.core;

import com.dxj.ffx.subject.tree.entity.Node;
import com.dxj.ffx.subject.tree.util.CreateTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 116 按层连接完美二叉树
 */
public class Connect {
    private static final Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        Node process = CreateTreeNode.createNode(arr);
        Connect connect = new Connect();
        Node connect1 = connect.connect(process);
        System.out.println(connect1);
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMost = root;

        while (leftMost.left != null) {
            Node head = leftMost;
            while (head != null) {
                head.left.next = head.right;
                if (head.next != null) {
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    public Node connectMine2(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (poll == null || poll.left == null || poll.right == null) {
                    continue;
                }
                poll.left.next = poll.right;
                System.out.println("左节点->" + poll.left);
                if (poll.next != null) {
                    poll.right.next = poll.next.left;
                    System.out.println("左节点->" + poll.right);
                }
                queue.offer(poll.left);
                queue.offer(poll.right);
            }
        }
        return root;
    }

    public Node connectRefactor(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            // 记录当前队列大小
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (i < size - 1) {
                    poll.next = queue.peek();
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        return root;
    }

    public Node connectMine(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node pre = null;
            int size = queue.size();
            int oriSize = size;
            while (size > 0) {
                Node node = queue.poll();
                size = size - 1;
                if (node == null) {
                    continue;
                }
                if (size == oriSize - 1) {
                    pre = node;
                } else {
                    pre.next = node;
                    pre = node;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
