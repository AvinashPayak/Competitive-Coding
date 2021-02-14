#include<bits/stdc++.h>
using namespace std;

void snake(int n, int m){
    int copym = m;
    for(int i=0;i<n;i++){
        if(i%2 == 0) while(copym--) cout << "#";
        else{
            if((i/2)%2 == 0){
                copym-=1;
                while(copym--) cout << ".";
                cout << "#";
            }
            else{
                copym-=1;
                cout << "#";
                while(copym--) cout << ".";
            }
        }
        copym = m;
        cout << endl;
    }
}
int main(){
    int n,m;
    cin >> n >> m;
    snake(n,m);
    return 0;
}