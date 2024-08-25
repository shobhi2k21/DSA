package Tree.BST;

import Tree.TreeNode;

/**
 * Basic
 */
public class Basic {

    // LC 701 : Insert into a Binary Search Tree
    // Approach 1: USing recursion
    // Time : O(logn), worst=>O(n) ,Space: O(logn = height) -> avg case/best, worst
    // => O(n)
    private TreeNode insertApproach1(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (root.val > val)
            root.left = insertApproach1(root.left, val);
        else if (root.val < val)
            root.right = insertApproach1(root.right, val);

        return root;
    }

    // Approach 2 : Using While Loop
    // Time : O(log n), worst=>O(n) ,Space: O(1)

    private TreeNode insertApproach2(TreeNode root, int val) {
        TreeNode curr = root, prev = null;
        TreeNode node=new TreeNode(val);
        while (curr != null) {
            prev = curr;
            if (root.val > val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if(prev.val>val){
            prev.left=node;
        } else{
           prev.right = node; 
        }

        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // return insertApproach1(root, val);
        return insertApproach2(root, val);
    }

}