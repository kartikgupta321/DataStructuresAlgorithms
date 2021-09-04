// using quick select
#include<iostream>
using namespace std;

void swap(int* a,int* b){
    int t=*a;
    *a=*b;
    *b=t;
}
int partition(int arr[],int low,int high){
    int pivot=arr[high];
    int i=low-1;
    for (int j = low; j <= high-1;j++){
        if (arr[j]<pivot){
            i++;
            swap(&arr[i],&arr[j]);
        }
    }
    swap(&arr[i+1],&arr[high]);
    return i+1;
}
void quickselect(int arr[],int low,int high,int k,int &c){
    c++;
    if (low<high){
        int pi=partition(arr,low,high);
        if(k-1<pi)
            quickselect(arr,low,pi-1,k,c);
        else
            quickselect(arr,pi+1,high,k,c);
    }
}
int main(){
    int c=0,k,arr[]={10, 7, 8, 9, 1, 5};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<"enter k-";
    cin>>k;
    quickselect(arr,0,n-1,k,c);
    cout<<"kth smallest is-"<<arr[k-1]<<" c is- "<<c;
    return 0;
}
