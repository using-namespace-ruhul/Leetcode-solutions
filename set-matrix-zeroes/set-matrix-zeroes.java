class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int first_Row = -1;
        int first_Col = -1;

        for(int row = 0; row < m; row++){
            for(int col = 0; col< n; col++){
                if( matrix[row][col] == 0 && row == 0 ){
                    first_Row = 1;
                }
                if( matrix[row][col] == 0 && col == 0){
                    first_Col = 1;
                }
                if( matrix[row][col] == 0 ){
                    matrix[row][0] = matrix[0][col] = 0;
                }
            }
        }
        
        for( int i = 1; i < m; i++){
            if( matrix[i][0] == 0 ){
                for( int j = 1; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for( int i = 1; i < n; i++){
            if( matrix[0][i] == 0 ){
                for( int j = 1; j < m; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        
        if( first_Row == 1){
            for( int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }
        
        if( first_Col == 1){
            for( int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}