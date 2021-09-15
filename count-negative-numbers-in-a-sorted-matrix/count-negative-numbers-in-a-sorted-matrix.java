class Solution {
    public int countNegatives(int[][] grid) {
        int row_len = grid[0].length;//No. of columns in each row.
        int col_len = grid.length;//No. of rows.
        
        int ans = 0;
        int i = 0;//For row.
        int j = row_len - 1;//For column.//Starting from 1st row last element.
        
        while(i<col_len && j>=0){
            if(grid[i][j]<0){
                ans += (col_len-i);
                j--;
            }else{
                i++;
            }
        }
    return ans;
    }
}