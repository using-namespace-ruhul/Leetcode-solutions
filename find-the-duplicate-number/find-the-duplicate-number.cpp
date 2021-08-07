class Solution {
public:
    int findDuplicate(vector<int>& nums) {
             int n=nums.size();
         int v[n];
      for(int i=0; i<n; i++){
        v[i]=0;
      }
      int res;
      for(int i=0; i<n; i++){
        v[nums[i]]++;
      }
      for(int i=0; i<n; i++){
        if(v[i]>1){
          res = i;
          break;
        }
      }
     return res;   
    }
};