class Solution {
public:
    int TheWinner(int n, int k) {
        if(n==1) return 0;
    return (TheWinner(n-1,k)+k)%n;
    }
    
    int findTheWinner(int n, int k){
        
    return (TheWinner(n,k)+1);
    }
};