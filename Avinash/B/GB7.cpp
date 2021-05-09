#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,Max,x;
    cin >> n;
    cin >> Max;
    cout << Max << " ";
    for(int i=1;i<n;i++){
        cin >> x;
        x+=Max;
        cout << x << " ";
        Max = max(Max,x);
    }
}