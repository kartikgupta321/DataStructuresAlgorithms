#include<iostream>

using namespace std;

bool ifprime(int n){
    if(n<=0)
        return false;
    for (int i = 2; i*i <=n ; i++){
        if(n%i==0)
            return false;
    }
    return true;
}
int main(){
    cout<<ifprime(7);
}