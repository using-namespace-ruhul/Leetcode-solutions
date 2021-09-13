class Solution {
    public int findKthPositive(int[] arr, int k) {
        int exp_end = arr.length;
        int e = arr.length-1;
        int s = 0;
        int noOfMissings = arr[e]-exp_end;
        if(noOfMissings<k){
            return arr[e]+(k-noOfMissings);
        }else{
            while(s<=e){
                int m = s+(e-s)/2;
                
                noOfMissings = arr[m]-(m+1);
                if(noOfMissings < k){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }
            if(e == -1){
                return k;
            }
        }
        noOfMissings = arr[e]-(e+1);
    return arr[e]+(k-noOfMissings);
    }
}