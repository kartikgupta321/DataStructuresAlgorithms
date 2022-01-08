#include<iostream>
#include<vector>
#include<algorithm>
#include<map>
using namespace std;
int main(){
    long long t,n,val;
    cin>>t;
    vector<long long> v[t];
    for (long long i = 0; i < t; i++){
        cin>>n;
        for (long long j = 0; j < n; j++){
            cin>>val;
            v[i].push_back(val);
        }   
        vector<long long> msbc;
        for (long long j = 0; j < n; j++){
            long long msb=0;
            while(v[i].at(j)!=0){
                (v[i].at(j))=(v[i].at(j))/2;
                msb++;
            }
            msbc.push_back(msb);
        }
        sort(msbc.begin(),msbc.end());
        map<long long,long long> m;
        for (long long j = 0; j<n; j++){
            if (m.find(msbc[j]) == m.end()){
                m[msbc[j]]=1;
            }
            else{
                m[msbc[j]]++;
            }
        }
        long long  pairs=0;
        for (auto& it:m ){
            long long x=it.second;
            pairs+=(x*(x-1))/2;
        }
        cout<<pairs<<endl;
    }
    return 0;
}
// 5
// 5
// 1 4 3 7 10
// 3
// 1 1 1
// 4
// 6 2 5 3
// 2
// 2 4
// 1
// 1







    