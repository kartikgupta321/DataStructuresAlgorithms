#include<iostream>
#include<conio.h>
#include<vector>
#include<cstring>
using namespace std;
void sieveoferastosthenes(int n){
    bool prime[n+1];
    memset(prime,true,sizeof(prime));

    for (int i = 2; i*i<=n; i++){
        if(prime[i]==true){
            for (int j = i*i; j <= n; j+=i){
                prime[j]=false;
            }
        }
    }
    
    for (int i = 2; i < n; i++){
        if(prime[i]){
            cout<<i<<' ';
        }
    }
}
int main(){
    sieveoferastosthenes(15);
}