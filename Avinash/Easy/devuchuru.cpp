#include<bits/stdc++.h>
using namespace std;

int songs(int arr[], int n, int d){
    int sum = 0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    if(sum+10*(n-1) > d) return -1;
    else return 2*(n-1) + (d - sum-10*(n-1))/5;
}

int main(){
    int n,d;
    cin >> n >> d;
    int arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    cout << songs(arr,n,d);
    return 0;
}