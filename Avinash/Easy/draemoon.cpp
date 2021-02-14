#include<iostream>
using namespace std;

int main(){
    int n,m;
    cin >> n >> m;
    if(m>n) cout << -1;
    else{
        int c2 = n/2;
        int c1 = n%2;
        int minStairs = c1+c2;
        if(minStairs<=m) cout << m;
        else {
            int i=1;
            int copym = m;
            while(copym<minStairs){
                copym = m;
                i++;
                copym*=i;
            }
            cout << copym;
        }
    }
    return 0;
}