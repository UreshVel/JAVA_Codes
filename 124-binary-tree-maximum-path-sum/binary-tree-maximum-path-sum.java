class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxPath(root,max);
        return max[0];
    }
    static int maxPath(TreeNode node , int[] max){
        if(node==null) return 0;
        int l = Math.max(0,maxPath(node.left,max));
        int r = Math.max(0,maxPath(node.right,max));
        max[0] = Math.max(max[0],l+r+node.val);
        return Math.max(l,r)+node.val;
    }
}