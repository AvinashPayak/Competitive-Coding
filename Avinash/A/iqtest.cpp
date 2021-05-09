#include<bits/stdc++.h>
using namespace std;
int test(int arr[], int n){
    int even=0,odd=0,leven,lodd;
    for(int i=0;i<n;i++){
        if(arr[i]%2 ==0){
            even++;
            leven = i+1;
        }
        else if(arr[i]%2 == 1){
            odd++;
            lodd = i+1;
        }
    }
    if(odd == 1) return lodd;
    else return leven;
}
int main(){
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    cout << test(arr,n);
    return 0;
}