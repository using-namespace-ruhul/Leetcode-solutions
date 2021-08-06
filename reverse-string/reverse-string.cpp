class Solution {
public:
    void reverseString(vector<char>& s) {
        int hi=s.size()-1, lo=0;
      while(lo<=hi){
        swap(s[lo++],s[hi--]);
      }
    }
};