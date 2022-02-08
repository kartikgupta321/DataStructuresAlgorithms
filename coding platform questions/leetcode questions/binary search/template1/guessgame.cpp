// -1 if num is lower than the guess number
//  *			      1 if num is higher than the guess number
//  *               otherwise return 0
#include<iostream>
using namespace std;
int guess(int n){
    int pick =4;
    if(n==pick) return 0;
    else if(n>pick) return -1;
    else return 1;
}
int guessNumber(int n) {
    int left=1,right=n,pivot;
    while (left<=right){
        if(guess(n)==0) return n;
        pivot = left + (right-left)/2;
        if(guess(pivot)==0) return pivot;
        else if(guess(pivot)==-1) right =pivot-1;
        else left =pivot+1 ;
    }
    return 1;
}
int main(){
    cout<<guessNumber(30);
}    