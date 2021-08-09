class Solution {
public:
    int sumBase(int n, int k) {
        int rem,weight=1,n_in_base_k=0,sum=0;
        while(n>0){
            rem = n%k;
            n_in_base_k = n_in_base_k + rem * weight;
            weight *= 10;
            n /= k;
        }
        
        while(n_in_base_k>0){
            sum = sum + n_in_base_k%10;
            n_in_base_k/=10;
        }
    return sum;
    }
};