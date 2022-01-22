#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
void rotate(vector<vector<int> > &A) {
    int n= A.size();
    for (int i = 0; i < n; i++){
        for (int j = 0; j < i; j++){
            swap(A[i][j],A[j][i]);
        }
    }
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n/2; j++){
            swap(A[i][j],A[i][n-j-1]);
        }
    }
}
int main(){
    vector<vector<int>> A{{1, 2,3},{4,5,6 },{7,8,9}};
    rotate(A);
    for (int i = 0; i < A.size(); i++){
        for (int j = 0; j < A.size(); j++){
            cout<<A[i][j];
        }
        cout<<endl;
    }
    
}