package com.dxj.ffx.subject.tree.entity;

public class Node {
    public Integer val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right, Node next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }


    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
