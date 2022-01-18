#include<iostream>
using namespace std;
int gcd(int A, int B) {
    while(A>1){
        int temp =A;
        A = B%A;
        B =temp;
        gcd(A,B);
    }
    return B;
}
int main(){
    cout<<gcd(6,72);
}