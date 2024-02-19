package com.arun.dsa.tree.bst;

import com.arun.dsa.tree.entity.TreeNode;

public class BSTExamples {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(3);

        root.left.left.left =new TreeNode(1);

        root.right.right =new TreeNode(6);
        root.right.right.right =new TreeNode(7);


        System.out.println("-------------------------------------------------------------------");
        System.out.println("BST min value");
        System.out.println(minValue(root));
        System.out.println("-------------------------------------------------------------------");

    }

    public static int minValue(TreeNode node) {

        if(node == null)
            return -1;

        TreeNode curr = node;
        TreeNode next = curr;

        while(next!=null){
            curr = next;
            next = curr.left;
        }

        return curr.data;

    }

}
