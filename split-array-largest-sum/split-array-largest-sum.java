class Solution {
    public int splitArray(int[] nums, int m) {
        
        int start = Integer.MIN_VALUE;
        int end = 0;
        
        for(int i=0; i<nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        
        while(start<end){
            
            int mid = start+(end-start)/2;
            
            int sum = 0;
            int pieces = 1;
            for(int curr_element : nums){
                if(sum + curr_element > mid){
                    sum = curr_element;
                    pieces++;
                }else
                    sum += curr_element;
            }
            
            if(pieces <= m)
                end = mid;
            else
                start = mid+1;
        }
    return end;//Or start.    
    }
}