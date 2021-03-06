class Solution {
    public int arrangeCoins(int n) {
       long nLong = (long)n;
        long left = 1;
        long right = nLong;
        
        while(left<=right){
            long mid = left+(right-left)/2;
            
            if(mid*(mid+1)/2 <= nLong){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
    return (int)right;
    }
}