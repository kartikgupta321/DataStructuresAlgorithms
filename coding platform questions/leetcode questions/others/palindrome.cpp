#include<iostream>
#include<string>
#include<math.h>
using namespace std;
// bool ispalindrome( int x){
//     string str = to_string(x);
//     int size = str.length();  
//     for (int i = 0; i <= size/2; i++){
//         if (str.at(i)==str.at(size-1-i)){
//             continue;
//         }
//         else{
//             return false;
//         }
//     }
//     return true;
// } alternate sol without string
bool ispalindrome(int x){
    int size = 0;
    while(x){
        x = x/10;
        size++;
    }
    for (int i = 0; i < size/2; i++){
        if (x/(pow(10, size-1-i)) == x%10){
            x = x >>1;
            continue;
        }
        else{
            return false;
        }
    }
    return true;
}
 int main(){
    int n;
    cout<<"enter no.-";
    cin>>n;

    if (ispalindrome(n) == true){
        cout<<"is palindrome";
    }
    else{
        cout<<"not palindrome";
    }  
 }