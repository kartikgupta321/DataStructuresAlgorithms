#include<iostream>
#include<string>
#include<vector>
using namespace std;
// string firstPalindrome(vector<string>& words) {

// }






int main(){
    int n;
    cout<<"enter array size- ";
    cin>>n;
    vector<string> words[n];
    for (int i = 0; i < n; i++){
        cout<<"enter string["<<i<<"]";
        cin>>words[i];
    }
    cout<<words[2];
    
}