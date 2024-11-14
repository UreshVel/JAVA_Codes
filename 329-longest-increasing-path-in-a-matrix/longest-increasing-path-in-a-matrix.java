class Solution {
    int maxLen =0;
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int [][] dp = new int[m][n];

        for(int i =0; i<m  ; i++){
            for(int j=0; j< n ;j++){
                bfsTraversal(i, j, matrix, dp);
            }
        }
        return maxLen+1;
    }
    void bfsTraversal(int i, int j,int [][] matrix, int [][]dp){
        int [] dir = {-1,0,1,0,-1};
        
        for(int k =0; k< 4 ; k++){
             int x = i+dir[k];
             int y = j+dir[k+1];
            if(x>=0 && y>=0 && x<matrix.length && y<matrix[0].length && matrix[i][j] < matrix[x][y] && dp[x][y] < dp[i][j]+1){
                   dp[x][y] = dp[i][j]+1;
                   maxLen = Math.max(maxLen,  dp[x][y]);
                   bfsTraversal(x, y, matrix, dp);
            }
        }
    }
}