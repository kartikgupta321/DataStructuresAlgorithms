#include<iostream>
using namespace std;
int main(){
    long long x,y,res=1;
    cout<<"enter x and y- ";
    cin>>x>>y;
    while(y>0){
        if(y&1==1)
            res*=x;
        x=x*x;
        y=y>>1;
    }
    cout<<res;
    
    return 0;
}