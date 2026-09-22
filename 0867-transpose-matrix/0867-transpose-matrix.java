class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] result=new int[c][r];

        for(int i=0;i<=c-1;i++){
            for(int j=0;j<=r-1;j++){
                result[i][j]=matrix[j][i];
            }
        }
        return result;
    }
}