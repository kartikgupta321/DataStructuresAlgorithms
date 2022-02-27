#include<iostream>
using namespace std;
int numSetBits(unsigned int A) {
    int count =0;
    while (A!=0){
        if(A%10==1) {count +=1;}
        A = A>>1;
    }
    return count;

}

int main(){
    cout<<numSetBits(2);
    // cout<<(11>>1);
}