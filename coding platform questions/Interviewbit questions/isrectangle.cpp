#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int solve(int A, int B, int C, int D) {
    if (A==B){
        if (C==D){
            return 1;
        }
    }
    if (A==C){
        if (B==D){
            return 1;
        }
    }
    if (A==D){
        if (B==C){
            return 1;
        }
    }
    return 0;

    
}
int main(){
    int A= 1,B=2,C=3,D=4;
    cout<<solve(A,B,C,D);
}