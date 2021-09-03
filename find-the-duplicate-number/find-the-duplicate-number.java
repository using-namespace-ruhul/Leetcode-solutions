class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct_Index = nums[i]-1;
            if(nums[correct_Index]!=nums[i]){
                swap(nums,i,correct_Index);
            }else{
                i++;
            }
        }
        
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return nums[j];
            }
        }
    return 0;    
    }
    
    public void swap(int[] arr, int first_Number, int second_Number){
        int temp = arr[first_Number];
        arr[first_Number] = arr[second_Number];
        arr[second_Number] = temp;
    }
}