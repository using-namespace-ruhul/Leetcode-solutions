class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct_Index = nums[i]-1;
            if(nums[i]!=nums[correct_Index]){
                swap(nums,i,correct_Index);
            }else{
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0; j<nums.length; j++){
            if(j!=nums[j]-1){
                list.add(j+1);
            }
        }
    return list;    
    }
    
    public void swap(int[] arr, int first_Index, int second_Index){
        int temp = arr[first_Index];
        arr[first_Index] = arr[second_Index];
        arr[second_Index] = temp;
    }
}