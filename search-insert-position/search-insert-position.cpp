class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int n = nums.size();
        int lo = 0, hi = n-1;
        if(nums.size()==0) return 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]==target)
                return mid;
            else if(target>nums[mid])
                lo = mid+1;
            else 
                hi = mid-1;
        }
    return lo;
    }
};