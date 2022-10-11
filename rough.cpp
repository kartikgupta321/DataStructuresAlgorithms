#include<iostream>
#include<cctype>
using namespace std;
int main(){
    char a='p';
    int x=a^(1<<5);
    cout<<char(x);

    return 0;
}