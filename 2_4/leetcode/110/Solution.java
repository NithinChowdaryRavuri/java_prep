class Solution {
    private boolean result = true;
    private int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(Math.abs(left - right) > 1) result = false;
        return Math.max(left, right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return result;
    }
}