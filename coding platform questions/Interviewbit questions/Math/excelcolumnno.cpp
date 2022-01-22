#include<iostream>
#include<math.h>
#include<string>
using namespace std;
int titleToNumber(string A) {
    int n=0,size=A.length(),count=0;
    for (int i = size-1 ;i >=0 ; i--){
        n += pow(26,count)*(A.at(i)-64);
        count +=1;
    }
    return n;
}
int main(){
    cout<<titleToNumber("AB");
}