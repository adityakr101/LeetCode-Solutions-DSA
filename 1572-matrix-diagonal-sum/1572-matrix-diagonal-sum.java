class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        int sum2=0;

        for(int i=0;i<=mat.length-1;i++){
            for(int j=0;j<=mat[i].length-1;j++){
                if(i==j){
                    sum1+=mat[i][j];
                }
                else if(i+j==mat.length-1 && i!=j){
                    sum2+=mat[i][j];
                }
            }
        }
        return sum1+sum2;
    }
}