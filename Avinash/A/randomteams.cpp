#include<bits/stdc++.h>
using namespace std;

void teams(long long n, long long m){
    long long min,max;
    min = (n%m)*(n/m +1)*(n/m)/2 + (m-n%m)*(n/m)*(n/m -1)/2;
    max = ((n-(m-1))*(n-m))/2;
    if(m == 1) cout << max <<" "<<max;
    else cout <<min << " "<<  max;
}

int main(){
    long long n,m;
    cin >> n >> m;
    teams(n,m);
    return 0;
}