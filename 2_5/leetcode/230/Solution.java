class Solution {
    private int result = 0;
    private int count = 0;
    private void dfs(TreeNode root, int k){
        if(root == null || count > k) return;
        dfs(root.left, k);
        count++;
        if(count == k) result = root.val;
        dfs(root.right, k);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }
}