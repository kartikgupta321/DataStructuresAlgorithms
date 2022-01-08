#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int addNumbers(int A, int B) {
    while (B !=0){
        unsigned carry =A&B;
        A = A^B;
        B = carry<<1;
    }
    return A;
}

int main(){
    int A=3,B=10;
    cout<<addNumbers(A,B);
}