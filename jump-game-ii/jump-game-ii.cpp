class Solution {
public:
    int jump(vector<int>& nums) {
    int n = nums.size();
    
   int range_of_jump = nums[0];
   int max_reachable_index = nums[0];
    
   int current_reachable_index ;
   
    
    int jump_count = 1; // because we initiate i =1 , i.e. 1 jump is already made//
    
    
    if ( n == 1)
    return 0;
   
   else
    
    for (int i = 1; i < n-1; i++ ){
        
        current_reachable_index = nums[i] + i;
        
        if ( current_reachable_index > max_reachable_index){
            
            max_reachable_index = current_reachable_index;
            
       }
   
        if ( i == range_of_jump){
            
            jump_count ++;
            
            range_of_jump = max_reachable_index;
        }
    
    
    }

    return jump_count;
    }
};