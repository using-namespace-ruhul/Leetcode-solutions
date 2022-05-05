class Solution {
    public void sortColors(int[] nums) {
        int lo=0,mid=0,hi=nums.length-1;
        while(mid<=hi){
            if(nums[mid]==0){
                swap(nums,mid,lo);
                lo++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,hi);
                hi--;
            }
        }
    }
    
    public void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}