#include <iostream>
#include <conio.h>
#include <array>
using namespace std;
int main(){
//    int nums[]={3,2,3,3,1},majority=0,bits,size;
//    size=sizeof(nums)/sizeof(nums[0]);
//     for (unsigned int i = 0, mask = 1; i < 32; i++, mask <<= 1){
//         int bits=0;
//         for ( int n : nums){
//             if (n & mask){
//                 bits++;
//             }
//         }
//         if (bits > size/2){
//             majority |= mask;
//         }   
//     }
//     cout<<majority;

    int res=0,n;
    for (int i = 1; i <= n; i++){
        res=(3*(i)+2);
        if(res%4==0){
            continue;
        }
        cout<<res<<endl;
    }
    
    return 0;
}