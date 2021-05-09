#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0;i<n;i++) cin >> arr[i];
    int book = 0;
    for(int i=0;i<n;i++){
        int val;
        cin >> val;
        if(val>= book) {
            cout << val - book << " ";
            book = val;
        }
        else cout << "0 ";
    }
    return 0;
}