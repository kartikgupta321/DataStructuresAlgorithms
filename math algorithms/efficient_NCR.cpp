#include<iostream>
#include<algorithm>
using namespace std;
long long gcd(long long a,long long b){
    if (a==0)
        return b;
    return gcd(b%a,a);
}
void printncr(long long n, long long r){
    long long p=1,k=1;
    if (n-r<r){
        r=n-r;
    }
    if (r!=0){
        while (r){
            p*=n;
            k*=r;
            long long m=gcd(p,k);
            // int m=__gcd(p,k);
            p/=m;
            k/=m;
            n--;
            r--;
        }
    }
    cout<<p;
    }
int main(){
    printncr(50,25);
    return 0;
}