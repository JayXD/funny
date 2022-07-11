package com.dxj.ffx.tree.application;

import com.dxj.ffx.tree.core.CreateTree;
import com.dxj.ffx.tree.core.PreorderTraversal;
import com.dxj.ffx.tree.entity.TreeNode;

import java.util.List;

public class Main {
    private static final Integer[] arr = new Integer[]{1, null, 2, 3};

    public static void main(String[] args) {

        TreeNode process = CreateTree.process(arr);

        List<Integer> res = PreorderTraversal.getObject().preorderTraversalRecursion(process);

        System.out.println(res);
    }
}
