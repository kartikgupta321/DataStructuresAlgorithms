#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;
int main(){
    int left,right,res;
    cout<<"enter left and right values-";
    cin>>left>>right;
    if(left==right){
        cout<<left;
    }
    else{
        int diff=right -left;
        int msb=1<<int(log2(diff));
        int mask= (msb<<1) - 1;
        cout<<(left&right&~mask);
    }

    return 0;
}