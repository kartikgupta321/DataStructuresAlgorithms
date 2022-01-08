// a rooted binary tree with one root node, where each node has either 0 or 2 child,a node is internal 
// if it has two outgoing nodes.how many rooted binary treees are there with n internal nodes.
#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    long long n;
    cout<<"enter no. of internal nodes- ";
    cin>>n;
    long long two_n=2*n,N=n,num=1,den=1;
    while(n){
        num*=two_n;
        den*=n;
        long long m=__gcd(num,den);
        num/=m;
        den/=m;
        two_n--;
        n--;
    }
    cout<<"no. of rooted binary trees- "<<(num/(N+1));
    return 0;
}
// // other examples:
// 1.count of structurally unique bsts with n keys is nth catalan no..
// 2.no. of ways to reach from bottom left to top right without crossing the main diagonal and 
// always pointing to right or top in n*n matrix is catalan series. 