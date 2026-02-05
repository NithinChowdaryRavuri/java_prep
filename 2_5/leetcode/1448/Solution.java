class Solution {
    private int result = 0;
    private void dfs(TreeNode root, int prev){
        if(root == null) return;
        if(root.val >= prev) result += 1;
        dfs(root.left, Math.max(root.val, prev));
        dfs(root.right, Math.max(root.val, prev));
        return;
    }
    public int goodNodes(TreeNode root) {
        dfs(root, -100000);
        return result;
    }
}