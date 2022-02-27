#include<iostream>
#include<vector>

using namespace std;
char nextGreatestLetter(vector<char>& letters, char target) {
    int l=0, r= letters.size();
    for (int i = 0; i < 26; i++){
        while (l<=r){
            int mid = l+ (r-l)/2;
            if(letters[mid] == char(target+i))  return letters[mid];
            else if(letters[mid] > char(target+i)) r= mid;
            else l =mid+1;
        }
        
    }
    return target;
    
}
int main(){
    vector<char> letters{'c','f','j'};
    char target ='a';
    // cout<<nextGreatestLetter(letters,'a');
    for (int i = 0; i < 26; i++){
        if('z'+i >122){
            cout<<char('z'+i-26);
        }
        else 
            cout<<char('z'+i);
    }
        
    
}
