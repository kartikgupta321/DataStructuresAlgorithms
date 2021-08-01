#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter n- ";
    cin>>n;
    while((n&1)==0){
        cout<<"2 ";
        n=n>>1;
    }
    for (int i = 3; i*i <= n ; i+=2){
        while(n%i==0){
            cout<<i<<" ";
            n/=i;
        }
    }
    if (n>2)     
        cout<<n;
    return 0;
}