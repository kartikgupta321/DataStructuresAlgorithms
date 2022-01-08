#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    long long n;
    cout<<"enter no. of left and right bracket pairs- ";
    cin>>n;
    long long twon=2*n;
    long long N=n;
    long long den=1;
    long long num=1;
    while (n){
        num*=twon;
        den*=n;
        long long m=__gcd(num,den);
        num/=m;
        den/=m;
        twon--;
        n--;
    }
    cout<<(num/(N+1));
    return 0;
}
// other examples:
// 1.count ways to divide circle using n non intersecting chords.
// 2.no. of ways to factors can be completely paranthesised or  multiplied.
// 3.no. of binary trees with n inorder travesals is catalan series.