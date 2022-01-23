#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int firstMissingPositive(vector<int> &A) {
    int n=A.size();
    for (int i = 0; i < n; i++){
        while (A.at(i) >=1 && A.at(i) <= n && A.at(i) != A.at(A.at(i)-1)){
            swap(A.at(i), A.at(A.at(i)-1));
        }   
    }
    for (int i = 0; i < n; i++){
        if (A.at(i) != i+1){
            return i+1;
        }
    }
    return n+1;
}
int main(){
    vector<int> A{-8, -7, -6};
    cout<<firstMissingPositive(A);
    // for (int i = 0; i < A.size(); i++){
    //     cout<<A.at(i);
    // }
    
}