#include<bits/stdc++.h>
using namespace std;
vector<int> st;
void buildsegmenttree(int st_idx,vector<int>& arr,int start, int end){
    if (start>end){
        return;
    }
    if (start==end){
        st[st_idx]=arr[start];
        return;
    }
    int middle=start+(end-start)/2;
    buildsegmenttree(2*st_idx,arr,start,middle);
    buildsegmenttree(2*st_idx+1,arr,middle+1,end);
    st[st_idx]=st[2*st_idx] + st[2*st_idx+1];
}
int query(int qs,int qe,int st_idx,int start,int end){
    if(qs>end or qe<start){
        return 0;
    }
    if (start>=qs and end<=qe){
        return st[st_idx];
    }
    int middle=start+(end-start)/2;
    int leftsum=query(qs,qe,2*st_idx,start,middle);
    int rightsum=query(qs,qe,2*st_idx+1,middle+1,end);
    return leftsum+rightsum;
}
void updatenode(int st_idx,int start,int end,int pos,int newvalue){
    if (start>pos or end<pos){
        return;
    }
    if (start==end){
        st[st_idx]=newvalue;
        return;
    }
    int middle=start+(end-start)/2;
    updatenode(2*st_idx,start,middle,pos,newvalue);
    updatenode(2*st_idx+1,middle+1,end,pos,newvalue);
    st[st_idx]=st[2*st_idx]+st[2*st_idx+1];
}

int main(){
    int  n=6;
    vector<int> arr={1,3,2,-2,4,5};
    st.resize(4*n+1);   
    int st_idx=1;
    int start =0,end=n-1;
    buildsegmenttree(st_idx,arr,start,end);
    cout<<"\n Segment tree is:-\n";
    for (int i = 0; i <4*n; ++i){
        cout<<st[i]<<" ";
    cout<<"\n";
    }
    cout<<"Query is 0-based indexed\n";
    cout<<"rangesum(2,4): "<<query(2,4,st_idx,start,end)<<"\n";
    cout<<"rangesum(1,4): "<<query(1,4,st_idx,start,end)<<"\n";
    cout<<"rangesum(3,3): "<<query(3,3,st_idx,start,end)<<"\n";

    arr[2]=100;
    updatenode(st_idx,start,end,2,100);
    
    for (int i = 0; i <4*n; ++i){
        cout<<st[i]<<" ";
    cout<<"\n";
    }
    cout<<"Query is 0-based indexed\n";
    cout<<"rangesum(2,4): "<<query(2,4,st_idx,start,end)<<"\n";
    cout<<"rangesum(1,4): "<<query(1,4,st_idx,start,end)<<"\n";
    cout<<"rangesum(3,3): "<<query(3,3,st_idx,start,end)<<"\n";

    return 0;
}