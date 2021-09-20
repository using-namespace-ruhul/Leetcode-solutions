class Solution {
    public int diagonalSum(int[][] mat) {
        int diagonal_1 = 0;
        int diagonal_2 = 0;
        int len = mat.length-1;
        for(int i = 0; i < mat.length; i++){
            diagonal_1 += mat[i][i];
        }
        for(int i = 0; i < mat.length; i++){
            if( i == len ){
                len--;
                continue;
            }else{
                diagonal_2 += mat[i][len];
                len--;
            }
        }
    return diagonal_1+diagonal_2;
    }
}