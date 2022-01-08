#include<iostream>
#include<conio.h>
using namespace std;
int main(){
    int x,y,count=0;
    cin>>x>>y;
    for (int i = 0; i < 32; i++){
        if((x^y)>>i & 1 ){
            count+=1;
        }
    }
    cout<<count;


    return 0;
}