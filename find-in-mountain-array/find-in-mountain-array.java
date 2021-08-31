/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int last_Index = mountainArr.length()-1;
        //for inc part
        int index_in_Increasing_part = forIncreasingOrder(mountainArr,target,0,peak);
        if(index_in_Increasing_part==-1){
            int index_in_Decreasing_part = forDecreasingOrder(mountainArr,target,peak+1,last_Index);
            if(index_in_Decreasing_part==-1)
                return -1;
            else 
                return index_in_Decreasing_part;
        }
        else 
            return index_in_Increasing_part;
    }
    
    public int findPeak(MountainArray arr){
        int start = 0;
        int end = arr.length()-1;
        
        while(start<end){
            
            int mid = start + (end-start)/2;
            
            if(arr.get(mid) > arr.get(mid+1))
                end = mid;
            else 
                start = mid+1;
        }
    return start;    
    }
    
    public int forIncreasingOrder(MountainArray arr, int target, int start, int end){
          while(start<=end){
              int mid = start + (end-start)/2;
              
              if(arr.get(mid)==target)
                  return mid;
              else if(arr.get(mid)>target)
                  end = mid-1;
              else
                  start = mid+1;
          }
     return -1;   
    }
    
    public int forDecreasingOrder(MountainArray arr, int target, int start, int end){
                  while(start<=end){
              int mid = start + (end-start)/2;
              
              if(arr.get(mid)==target)
                  return mid;
              else if(arr.get(mid)<target)
                  end = mid-1;
              else
                  start = mid+1;
          }
     return -1;
    }
    
}