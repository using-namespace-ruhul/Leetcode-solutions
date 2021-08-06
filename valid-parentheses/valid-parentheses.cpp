class Solution {
public:
unordered_map<char,int> symbols = {{'[',-1},{'{',-2},{'(',-3},{']',1},{'}',2},{')',3}};
    bool isValid(string s) {
             stack<char> st;
     for(char bracket:s){
           if(symbols[bracket]<0){
                 st.push(bracket);
           }
           else{
                 if(st.empty()) return 0;
                 char top = st.top();
                 st.pop();
                 if(symbols[bracket]+symbols[top]!=0) return 0;
           }
     }
     if(st.empty()) return 1;
     return 0;
    }
};