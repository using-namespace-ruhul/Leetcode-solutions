class Solution {
    public int singleNonDuplicate(int[] nums) {
       int s = 0;
        int e = nums.length-1;
        int ans = 0;
        while(s<=e){
            int m = s+(e-s)/2;
            
            if((m==0||m==nums.length-1)||(nums[m]!=nums[m-1]&&nums[m]!=nums[m+1])){
                return nums[m];
            }else if(nums[m]==nums[m+1]&&nums[m]!=nums[m-1]){
                if(m%2!=0){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }else if(nums[m]==nums[m-1]&&nums[m]!=nums[m+1]){
                if(m%2!=0){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }
        }
    return -1;
    }
}