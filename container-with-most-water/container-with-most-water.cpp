class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int i = 0, j = n-1;
        int res = 0;
        while(i<j){
            int minimum = min(height[i],height[j]);
            res = max(res,(j-i)*minimum);
            if(height[i]<=height[j])
                i++;
            else if(height[j]<=height[i])
                j--;
        }
    return res;
    }
};