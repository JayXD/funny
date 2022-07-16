package com.dxj.ffx.tree.application;

import com.dxj.ffx.tree.core.CreateTree;
import com.dxj.ffx.tree.core.PreorderTraversal;
import com.dxj.ffx.tree.entity.TreeNode;

import java.util.List;

public class Main {
    private static final Integer[] arr = new Integer[]
            {1,
            2,     3,
        4,   5,    6, 7,
      8, 9, 10};

    public static void main(String[] args) {

        TreeNode process = CreateTree.process(arr);

        List<Integer> res1 = PreorderTraversal.getObject().preorderTraversalRecursion(process);
        List<Integer> res2 = PreorderTraversal.getObject().preorderTraversalIteration(process);

        System.out.println(res1);
        System.out.println(res2);
    }
}
