#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<int> solve(vector<int> &A) {
    int count = 0;
    int n=A.size();
    for (int i = 0; i < A.size(); i++){
        if (A.at(i)==1){
            count +=1;
        }
    }
    A.clear();
    for (int i = 0; i < (n-count); i++){
        A.push_back(0);
    }
    for (int i = 0; i < count; i++){
        A.push_back(1);
    }
    return A;
}
int main(){
    vector<int> A{ 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 };
    solve(A);
    for (int i = 0; i < A.size(); i++){
        cout<<A.at(i);
    }
    
    
}