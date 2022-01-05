#include<iostream>
#include<string>
using namespace std;
int romanToInt(string s) {
    int sum=0;
    for (int i = 0; i < s.length(); i++){
        if(s.at(i)=='I'){
            if( i!=(s.length()-1) && s.at(i+1)=='V' ){
                sum+=4;
                i+=1;
            }
            else if( i!=(s.length()-1) && s.at(i+1)=='X'){
                sum+=9;
                i+=1;
            }
            else
                sum+=1;
        }
        else if (s.at(i)=='V'){
            sum+=5;
        }
        else if(s.at(i)=='X'){
            if(i!=(s.length()-1) && s.at(i+1)=='L'){
                sum+=40;
                i+=1;
            }
            else if(i!=(s.length()-1) && s.at(i+1)=='C'){
                sum+=90;
                i+=1;
            }
            else
                sum+=10;
        }
        else if (s.at(i)=='L'){
            sum+=50;
        }
        else if(s.at(i)=='C'){
            if(i!=(s.length()-1) && s.at(i+1)=='D'){
                sum+=400;
                i+=1;
            }
            else if(i!=(s.length()-1) && s.at(i+1)=='M'){
                sum+=900;
                i+=1;
            }
            else
                sum+=100;
        }
        else if (s.at(i)=='D'){
            sum+=500;
        }
        else if (s.at(i)=='M'){
            sum+=1000;
        }
    }
    return sum;
    }
int main(){
    string s;
    cout<<"enter string- ";
    cin>>s;
    cout<<romanToInt(s);
}