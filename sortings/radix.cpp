#include<iostream>
using namespace std;
int max(int arr[],int n ){
    int max=arr[0];
    for (int i = 0; i <n; i++)  
        if (arr[i]>max)
            max=arr[i];
    return max;
}
void countsort(int arr[], int n,int exp){
    int count[10]={0};
    int output[n];

    for (int i = 0; i < n; i++)
        count[(arr[i]/exp)%10]++;
    for (int i = 0; i < 10; i++)
        count[i]+=count[i-1];
    
        
    
    







    for (int i = 0; i < n; i++)
        arr[i]=count[i];
        
    

}
void radixsort(int arr[],int n){
    int m=max(arr,n);
    for (int exp = 1; m/exp>0; exp*=10)
        countsort(arr,n,exp);
        
    



}
void print(int arr[],int n){
    for (int i = 0; i < n; i++)
        cout<<arr[i]<<" ";
}

int main(){
    int arr[]={170, 45, 75, 90, 802, 24, 2, 66};
    int n=sizeof(arr)/sizeof(arr[1]);
    radixsort(arr,n);
    print(arr,n);



    return 0;
}