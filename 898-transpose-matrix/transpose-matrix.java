class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;        
        int o = matrix[0].length;     

        int[][] transposed = new int[o][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < o; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    
    } 
}