class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct_Index = nums[i]-1;
            if(nums[i]!=nums[correct_Index]){
                swap(nums,i,correct_Index);
            }else{
                i++;
            }
        }
        
        int[] ans = {0,0};
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
                ans[0] = nums[index];
                ans[1] = index+1;
            }
        }
    return ans;
    }
    
     public void swap(int[] arr, int first_Index, int second_Index){
        int temp = arr[first_Index];
        arr[first_Index] = arr[second_Index];
        arr[second_Index] = temp;
    }
}