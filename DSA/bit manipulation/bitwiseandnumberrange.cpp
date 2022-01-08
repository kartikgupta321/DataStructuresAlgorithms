#include<iostream>
using namespace std;
int main(){
	int m,n,c=0;
    cin>>m>>n;
	while(m!=n){
		m>>=1;
		n>>=1;
		++c;
	}
	cout<<(n<<c);
    return 0;
}