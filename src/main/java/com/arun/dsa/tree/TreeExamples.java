package com.arun.dsa.tree;

import com.arun.dsa.tree.entity.TreeNode;

import java.util.*;

public class TreeExamples {

    public static void main(String[] args) {

        //create a tree

//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(7);
//        root.left.left = new TreeNode(17);
//        root.left.right = new TreeNode(19);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(1);
//        root.right.right = new TreeNode(2);
//        root.right.left.left = new TreeNode(6);


        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.left.left.left = new TreeNode(80);
        root.left.left.right = new TreeNode(90);

        root.left.right.left = new TreeNode(100);
        root.left.right.right = new TreeNode(110);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        root.right.left.left = new TreeNode(120);


        System.out.println("------------------------------------------------------------");
        System.out.println(" Calculating the size of tree ");
        System.out.println(" size of tree is " + size(root));
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println(" Calculating the count of complete binary tree. " +
                "Complete binary tree a binary tree in which every level, " +
                "except possibly the last, is completely filled, and all nodes in the last level are filled from left to right");
        System.out.println(" node Counts For Complate Binary Tree of tree is " + nodeCountsForComplateBinaryTree(root));
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Printing the preorder of tree");
        preOrder(root);
        System.out.println();
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        System.out.println("Printing the in order of tree");
        inOrder(root);
        System.out.println();
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        System.out.println("Printing the post order of tree");
        postOrder(root);
        System.out.println();
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        System.out.println("Printing the max of tree");

        System.out.println("Maximum of tree is " + max(root));
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("Printing the min of tree");

        System.out.println("Minimum of tree is " + min(root));
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("Printing the height of tree");

        System.out.println("Height of tree is " + height(root));
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        System.out.println("Printing the k distance modes of tree");

        int k = 0;
        System.out.println("K = " + k + " distance nodes of tree are ");
        print_K_distance_nodes(root, k);
        System.out.println();
        System.out.println("------------------------------------------------------------");

        k = 1;
        System.out.println("K = " + k + " distance nodes of tree are ");
        print_K_distance_nodes(root, k);
        System.out.println();
        System.out.println("------------------------------------------------------------");

        k = 2;
        System.out.println("K = " + k + " distance nodes of tree are ");
        print_K_distance_nodes(root, k);
        System.out.println();
        System.out.println("------------------------------------------------------------");

        k = 3;
        System.out.println("K = " + k + " distance nodes of tree are ");
        print_K_distance_nodes(root, k);
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("printing the left view of tree");
        printLeftView(root, 1);
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        System.out.println("printing the left view of tree(Non recursive)");
        printLeftViewNonRecursive(root);
        System.out.println();
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("printing the child sum property value of tree");
        System.out.println("Child sum property for tree is " + checkChildSumProperty(root));
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("printing the is balanced tree");
        System.out.println("Is the tree is balance " + isBalanced(root));
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("printing the is balanced tree(optimized)");
        System.out.println("Is the tree is balance " + isBalancedOptimized(root));
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("printing the the max width of tree");
        System.out.println("the max width od tree is " + maxWidth(root));
        System.out.println("------------------------------------------------------------");


//        //Test 1
//        int[] inorder = {20, 10, 40, 30, 50};
//        int[] preorder = {10, 20, 30, 40, 50};

//        //Test 2
//        int[] inorder = {40,20,50,10,30,80,70,90};
//        int[] preorder = {10,20,40,50,30,70,80,90};

        //Test 3
//        int[] inorder = {7, 9, 4, 2, 5, 1, 3, 6, 8};
//        int[] preorder = {1, 2, 4, 7, 9, 5, 3, 6, 8};
//
        //test 4
        int[] inorder = {80,40,90,20,100,50,110,10,120,60,30,70};
        int[] preorder = {10,20,40,80,90,50,100,110,30,60,120,70};


        TreeNode treeNode = buildTreeFromPreAndInorder(inorder, preorder, 0, inorder.length - 1);
        System.out.println(traversePreOrder(treeNode));

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("printing the tree is spiral");
        System.out.println("the spiral  is ");
        printTreeSpiral(root);
        System.out.println();
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("printing the tree is spiral efficient");
        System.out.println("the spiral  is ");
        printSpriralTreeEfficient(root);
        System.out.println();
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("printing the diamter of tree is ");
        System.out.println("the diameter  is " + diameter(root, "\t"));
        System.out.println();
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        System.out.println("printing the diamter effificient of tree is ");
        System.out.println("the diameter  is " + diameter_efficient(root, "") + " --> " + diamter);
        System.out.println();
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("printing the least common ancestor for tree is ");
        System.out.println("the LCA  is " + leastCommonAncestor(root, 2, 6));
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        System.out.println("height of tree is " + burnTreeTime(root, 110, new Depth(-1), "") + " and time to burn tree is " + timeToBurnWholeTree);
        System.out.println("------------------------------------------------------------");
        System.out.println("-------------------Serialize the tree-----------------------------------------");

        System.out.println(traversePreOrder(root));

        System.out.println(serialize(root));
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------Deserialize the tree------------------------------------------");


        List<Integer> preOrder = serialize(root);

        System.out.println(traversePreOrder(deserialize(preOrder)));
        System.out.println("------------------------------------------------------------");
        System.out.println("-------------------------Non recursive approach-----------------------------------");

        System.out.print("iterativeInOrder :                ");
        iterativeInOrder(root);

        System.out.print("iterativePreOrder :               ");
        iterativePreOrder(root);

        System.out.print("iterativeSpaceOptimizePreOrder :  ");
        iterativeSpaceOptimizePreOrder(root);
        System.out.println("------------------------------------------------------------");

        topView(root);


    }

    private static int maxWidth(TreeNode root) {

        if (root == null) return 0;

        int maxWidth = 0;

        Queue<TreeNode> queue = new LinkedList();

        queue.add(root);

        while (!queue.isEmpty()) {

            int currentSize = queue.size();

            maxWidth = Math.max(currentSize, maxWidth);

            for (int i = 0; i < currentSize; i++) {

                TreeNode currentNode = queue.poll();

                if (currentNode.left != null)
                    queue.add(currentNode.left);


                if (currentNode.right != null)
                    queue.add(currentNode.right);

            }

        }


        return maxWidth;

    }

    private static int isBalancedOptimized(TreeNode root) {


        if (root == null) return 0;

        int leftHeight = isBalancedOptimized(root.left);

        if (leftHeight == -1) return -1;

        int rightHeight = isBalancedOptimized(root.right);

        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        else return Math.max(leftHeight, rightHeight) + 1;


    }


    public static boolean isBalanced(TreeNode node) {

        if (node == null)
            return true;

        int leftHeight = height(node.left);
        int rightHeigh = height(node.right);

        if (Math.abs(leftHeight - rightHeigh) > 1)
            return false;

        return isBalanced(node.left) && isBalanced(node.right);


    }

    public static boolean checkChildSumProperty(TreeNode root) {

        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;

        boolean checkForSum = root.data == (root.left == null ? 0 : root.left.data) + (root.right == null ? 0 : root.right.data);

        return checkForSum && checkChildSumProperty(root.left) && checkChildSumProperty(root.right);

    }

    public static void print_K_distance_nodes(TreeNode root, int k_distance) {

        if (root == null) return;

        if (k_distance == 0)
            System.out.print(root.data + " ");

        print_K_distance_nodes(root.left, k_distance - 1);
        print_K_distance_nodes(root.right, k_distance - 1);

    }

    public static void printLeftViewNonRecursive(TreeNode root) {

        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        while (!queue.isEmpty()) {

            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {

                TreeNode currentTreeNode = queue.poll();

                if (i == 0)
                    System.out.print(currentTreeNode.data + " ");

                if (currentTreeNode.left != null) {
                    queue.add(currentTreeNode.left);
                }

                if (currentTreeNode.right != null) {
                    queue.add(currentTreeNode.right);
                }

            }

        }


    }

    public static int maxLevel = 0;

    public static void printLeftView(TreeNode root, int level) {

        if (root == null) return;

        if (maxLevel < level) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }

        printLeftView(root.left, level + 1);
        printLeftView(root.right, level + 1);


    }

    public static int height(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null)
            return 1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }


    public static void preOrder(TreeNode root) {

        if (root == null) return;
        else {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    public static void postOrder(TreeNode root) {

        if (root == null) return;
        else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }

    }

    public static void inOrder(TreeNode root) {

        if (root == null) return;
        else {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    public static Integer size(TreeNode root) {

        if (root == null) return 0;
        return size(root.left) + size(root.right) + 1;

    }

    public static Double nodeCountsForComplateBinaryTree(TreeNode root) {

        if (root == null) return 0d;

        TreeNode currentNode = root;
        int leftHeight = 1;

        while (currentNode.left != null) {
            currentNode = currentNode.left;
            leftHeight++;
        }

        currentNode = root;
        int rightHeight = 1;
        while (currentNode.right != null) {
            rightHeight++;
            currentNode = currentNode.right;
        }

        if (leftHeight == rightHeight)
            return Math.pow(2, leftHeight) - 1;

        return 1 + nodeCountsForComplateBinaryTree(root.left) + nodeCountsForComplateBinaryTree(root.right);

    }

    public static int max(TreeNode root) {

        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    public static int min(TreeNode root) {

        if (root == null) return Integer.MAX_VALUE;

        return Math.min(root.data, Math.min(min(root.left), min(root.right)));
    }

    //build tree from pre and in order


    public static int preIndex = 0;

    public static TreeNode buildTreeFromPreAndInorder(int[] inorder, int[] preorder, int startIndex, int endIndex) {

        if (startIndex > endIndex) return null;

        TreeNode root = new TreeNode(preorder[preIndex++]);

        int rootFoundAt = 0;

        for (int i = 0; i <= endIndex; i++) {

            if (inorder[i] == root.data) {
                rootFoundAt = i;
                break;
            }

        }

        root.left = buildTreeFromPreAndInorder(inorder, preorder, startIndex, rootFoundAt - 1);
        root.right = buildTreeFromPreAndInorder(inorder, preorder, rootFoundAt + 1, endIndex);

        return root;

    }

    public static String traversePreOrder(TreeNode root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.data);

        String pointerRight = "└──";
        String pointerLeft = (root.right != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, root.left, root.right != null);
        traverseNodes(sb, "", pointerRight, root.right, false);

        return sb.toString();
    }

    public static void traverseNodes(StringBuilder sb, String padding, String pointer, TreeNode node,
                                     boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.data);

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.right != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.right != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.right, false);
        }

    }


    public static void printTreeSpiral(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList();
        Stack<TreeNode> stack = new Stack();

        queue.add(root);
        boolean reverse = false;


        while (!queue.isEmpty()) {

            int count = queue.size(); // this is important to take this size variable different,
            // because we are modifying the queue and size is change, so put the q size in for loop directly

            for (int i = 0; i < count; i++) {

                TreeNode curr = queue.poll();

                if (reverse)
                    stack.push(curr);
                else System.out.print(curr.data + " ");

                if (curr.left != null)
                    queue.add(curr.left);


                if (curr.right != null)
                    queue.add(curr.right);

            }

            if (reverse)
                while (!stack.isEmpty())
                    System.out.print(stack.pop().data + " ");

            reverse = !reverse;

        }

    }

    public static void printSpriralTreeEfficient(TreeNode root) {

        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();

        stack1.add(root);

        while (!(stack1.isEmpty() && stack2.isEmpty())) {

//            System.out.println("s1  "+stack1);
            while (!stack1.isEmpty()) {

                TreeNode cuurent = stack1.pop();
                System.out.print(cuurent.data + " ");

                if (cuurent.left != null)
                    stack2.push(cuurent.left);

                if (cuurent.right != null)
                    stack2.push(cuurent.right);


            }
//            System.out.println("s2==>"+stack2);

            while (!stack2.isEmpty()) {

                TreeNode cuurent = stack2.pop();
                System.out.print(cuurent.data + " ");

                if (cuurent.right != null)
                    stack1.push(cuurent.right);


                if (cuurent.left != null)
                    stack1.push(cuurent.left);


            }
        }

    }

    public static int diameter(TreeNode root, String tab) {


        long now = System.nanoTime();
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int currentDiameter = 1 + leftHeight + rightHeight;

        tab = tab + "\t";
        System.out.println(tab + (System.nanoTime() - now) + " nano sec");

        return Math.max(currentDiameter, Math.max(diameter(root.left, tab), diameter(root.right, tab)));

    }

    private static int diamter = 0;

    public static int diameter_efficient(TreeNode root, String tab) {

        long now = System.nanoTime();
        tab = tab + "\t";
        if (root == null)
            return 0;
//
//        if (root.left==null && root.right==null)
//            return 1;

        int leftHeight = diameter_efficient(root.left, tab);
        int rightHeight = diameter_efficient(root.right, tab);

        diamter = Math.max(1 + leftHeight + rightHeight, diamter);
        System.out.println(tab + (System.nanoTime() - now) + " nano sec");

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int leastCommonAncestor(TreeNode root, int n1, int n2) {

        if (root == null) return -1;

        if (root.data == n1 || root.data == n2)
            return root.data;

        int leftLca = leastCommonAncestor(root.left, n1, n2);

        int rightLca = leastCommonAncestor(root.right, n1, n2);

        if (leftLca != -1 && rightLca != -1)
            return root.data;

        if (leftLca != -1)
            return leftLca;
        else return rightLca;

    }


    static class Depth {
        int val;

        Depth(int val) {
            this.val = val;
        }
    }

    static int timeToBurnWholeTree = -1;

    public static int burnTreeTime(TreeNode root, int targetLeafNode, Depth depth, String tab) {

        if (root == null) {
            return 0;
        }

        if (root.data == targetLeafNode) {
            depth.val = 0;
            return 1;
        }

        Depth leftDepth = new Depth(-1);
        Depth rightDepth = new Depth(-1);

        int leftHeight = burnTreeTime(root.left, targetLeafNode, leftDepth, tab + "\t");

        int rightHeight = burnTreeTime(root.right, targetLeafNode, rightDepth, tab + "\t");

        if (leftDepth.val != -1) {
            depth.val = leftDepth.val + 1;
            timeToBurnWholeTree = Math.max(timeToBurnWholeTree, leftDepth.val + 1 + rightHeight);
        } else if (rightDepth.val != -1) {
            depth.val = rightDepth.val + 1;
            timeToBurnWholeTree = Math.max(timeToBurnWholeTree, rightDepth.val + 1 + leftHeight);
        }

        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static List<Integer> serialize(TreeNode root) {

        List<Integer> preOrder = new ArrayList<>();

        if (root == null) {
            preOrder.add(-1);
        } else {
            preOrder.add(root.data);
            preOrder.addAll(serialize(root.left));
            preOrder.addAll(serialize(root.right));
        }
        return preOrder;

    }

    public static int index = 0;

    public static TreeNode deserialize(List<Integer> preOrder) {

        if (index >= preOrder.size())
            return null;

        Integer currValue = preOrder.get(index++);


        if (currValue == -1)
            return null;


        TreeNode root = new TreeNode(currValue);

        root.left = deserialize(preOrder);
        root.right = deserialize(preOrder);

        return root;


    }


    public static void iterativeInOrder(TreeNode root) {

        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {

                stack.push(current);
                current = current.left;

            }

            current = stack.pop();
            System.out.print(current.data + ",");
            current = current.right;


        }

        System.out.println("\n");
    }

    public static void iterativePreOrder(TreeNode root) {

        if (root == null) return;


        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode current = stack.pop();
            System.out.print(current.data + ",");


            if (current.right != null)
                stack.push(current.right); //This is important because of LIFO, so first insert right then left, so that left process first

            if (current.left != null)
                stack.push(current.left);

        }
        System.out.println("\n");
    }

    public static void iterativeSpaceOptimizePreOrder(TreeNode root){

        if (root ==null) return;

        Stack<TreeNode> stack =new Stack();
        stack.push(root);
        TreeNode current = root;

        while (!stack.isEmpty() ){

            while (current!=null){
                System.out.print(current.data+ ",");

                if (current.right!=null)
                    stack.push(current.right);

                current = current.left;
            }

            current = stack.pop();

        }
        System.out.println("\n");
    }

    public static void topView(TreeNode root) {

        Map<Integer, Integer> map = new TreeMap();

        map = createMap(root, 0, map);

        //   System.out.println(map);

        for( Integer key: map.keySet()){
            System.out.print(map.get(key)+" ");
        }

    }

    public static Map<Integer,Integer> createMap(TreeNode node, int level, Map<Integer, Integer> map){

        if(node==null)
            return map;

        Queue<Map<Integer, TreeNode>> queue = new LinkedList<>();
        queue.add(Map.of(0,node));

        while (!queue.isEmpty()){

            int count = queue.size();
            for (int i = 0; i < count; i++) {

                Map<Integer,TreeNode> currentNodePair = queue.poll();

                Integer currLevel = currentNodePair.keySet().stream().findFirst().get();

                TreeNode currentTreeNode = currentNodePair.get(currLevel);

                if (!map.containsKey(currLevel)) {
                    map.put(Integer.valueOf(currLevel), currentTreeNode.data );
                }

                if (currentTreeNode.left!=null)
                    queue.add(Map.of(currLevel-1,currentTreeNode.left));

                if (currentTreeNode.right!=null)
                    queue.add(Map.of(currLevel+1,currentTreeNode.right));


            }


        }



        return map;
    }

}
