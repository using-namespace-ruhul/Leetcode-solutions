class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightPdtArray = new int[nums.length];
        int product = 1;
        for(int i=nums.length-1; i>=0; i--){
            product *= nums[i];
            rightPdtArray[i] = product;
        }
        product = 1;
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            int lp = product;
            int rp = rightPdtArray[i+1];
            res[i] = lp*rp;
            product *= nums[i];
        }
        res[nums.length-1] = product;
    return res;
    }
}