class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int countZero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                if(binarySearch(arr,arr[i]) && binarySearch(arr,2*arr[i])){
                    return true;
                }
            }else{
                countZero += 1;
            }
        }
    return countZero >= 2;
    }
    
	public boolean binarySearch(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            
            if(target<nums[m]){
                e = m-1;
            }else if(target>nums[m]){
                s = m+1;
            }else{
                return true;
            }
        }
    return false;
    }
}