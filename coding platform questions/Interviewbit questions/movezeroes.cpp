#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<int> solve(vector<int> &A) {
    int n=A.size();
    int count =0;
    for (int i = 0; i < n; i++){
        if (A.at(i) != 0){
            A.at(count) = A.at(i);
            count +=1;
        }
    }
    for (int i = count; i < n; i++){
        A.at(i) = 0;
    }
    return A;
}
int main(){
    vector<int> A{1, 10, 2, 9, 10, 3 };
    solve(A);
    for (int i = 0; i < A.size(); i++){
        cout<<A.at(i);
    }
}