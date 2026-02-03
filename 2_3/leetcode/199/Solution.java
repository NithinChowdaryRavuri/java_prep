class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        while(queue.size() > 0){
            int n = queue.size();
            int val = 0;
            for(int i = 0; i < n; i++){
                TreeNode node = queue.removeFirst();
                val = node.val;
                if(node.left != null) queue.addLast(node.left);
                if(node.right != null) queue.addLast(node.right);
            }
            result.add(val);
        }
        return result;
    }
}