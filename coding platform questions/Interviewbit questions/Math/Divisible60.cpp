#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int divisibleBy60(vector<int> &A) {
    int n =A.size(),sum=0,d20=0;
    if (n<3){
        int set=0;
        for (int i = 0; i < n; i++){
            if(A.at(i)>6) set =1;           
        }
        if(set==0) return 0;
        
    }
    
    
    
    for (int i = 0; i < n; i++){
        sum += A[i];
        if (A.at(i) %2==0 && A.at(i)%10==0){
            d20 =1;
        }   
    }
    if (sum % 3!=0 || d20 ==0){
        return 0;
    }
    return 1;
}

int main(){
    vector<int> A{0,3};
    cout<<divisibleBy60(A);
}