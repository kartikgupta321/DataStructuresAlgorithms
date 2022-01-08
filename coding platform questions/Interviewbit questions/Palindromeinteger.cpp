#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;
int isPalindrome(int A) {
    int count =0,sum=0,a=A,temp=A;
    while (A !=0){
        A /= 10;
        count +=1;
    }
    for (int i = 0; i < count; i++){
        sum += (a%10)*pow(10,(count-1-i));
        a = a/10;
    }
    if (sum ==temp){
        return true;
    }
    return false;
    
}
int main(){
    int A = 121;
    cout<<isPalindrome(2323232);
}