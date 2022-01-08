#include<iostream>

using namespace std;

bool ifprime(long long n){
    if(n<=0)
        return false;
    for (long long i = 2; i*i <=n ; i++){
        if(n%i==0)
            return false;
    }
    return true;
}
int main(){
    cout<<ifprime(7);
}