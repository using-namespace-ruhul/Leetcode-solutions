class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_len = matrix[0].length;
        int col_len = matrix.length;
        
        int row = 0;
        int col = row_len-1;
        while(row<col_len && col>=0){
            if(matrix[row][col]>target){
                col--;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                return true;
            }
        }
    return false;
    }
}