class Solution {
    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;
        TreeNode left = dfs(root.left, p, q);
        TreeNode right = dfs(root.right, p, q);
        if(root.val == p.val || root.val == q.val) return root;
        if(left != null && right!= null) return root;
        if(left != null) return left;
        return right;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }
}