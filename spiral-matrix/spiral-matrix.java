class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int minR = 0, minC = 0;
        int maxR = matrix.length-1, maxC = matrix[0].length-1;
        int m = matrix.length, n = matrix[0].length;
        int total = m*n;
        int count = 0;
        
        while(count < total){
               //Top wall
               for(int i=minR, j=minC; j<=maxC && count<total ; j++){
                   list.add(matrix[i][j]);
                   count++;
               }minR++;
               //Right wall
               for(int i=minR, j=maxC; i<=maxR && count<total ; i++){
                   list.add(matrix[i][j]);
                   count++;
               }maxC--;
               //Bottom wall
               for(int i=maxR, j=maxC; j>=minC && count<total ; j--){
                   list.add(matrix[i][j]);
                   count++;
               }maxR--;
               //Left wall
               for(int i=maxR, j=minC; i>=minR && count<total ; i--){
                   list.add(matrix[i][j]);
                   count++;
               }minC++;
        }
    return list;
    }
}