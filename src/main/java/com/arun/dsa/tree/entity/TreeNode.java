package com.arun.dsa.tree.entity;

public class TreeNode {

    public Integer data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer data){
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
