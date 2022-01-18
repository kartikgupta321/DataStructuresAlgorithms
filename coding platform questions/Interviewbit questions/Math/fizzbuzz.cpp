#include<iostream>
#include<vector>
#include<string>
using namespace std;
vector<string> fizzBuzz(int A) {
    vector<string> res;
    for (int i = 1; i <= A; i++){
        if(i%15==0){
            res.push_back("FizzBuzz");
            continue;
        }  
        else if(i%3==0){
            res.push_back("Fizz") ;
            continue;
        } 
        else if(i%5==0){
            res.push_back("Buzz");
            continue;
        } 
        string s = to_string(i);
        res.push_back(s);
    }
    return res;    
}

int main(){
    vector<string> a = fizzBuzz(17);
    for (int i = 0; i < a.size(); i++){
        cout<<a.at(i)<<" ";
    }
    // cout<<a.capacity();
    
}