#include <iostream>
#include<math.h>
#define ll unsigned long long
using namespace std;

int main()
{
 ios_base::sync_with_stdio(false);
 bool flag=false;
 ll t,n;
 cin>>t;
 while(t--)
 {
     cin>>n;
     flag=false;
     for(long long i=1; i<=i*i*i; i++)
     {
        long long b3 = n - i*i*i;
        long long b = (long long)round(pow(b3, 1.0/3));
        if(b> 0 && b3 == b*b*b) {
            flag = true;
            break;
        }
     }
     if(flag) cout<<"YES\n"; else cout<<"NO\n";
 }
 return 0;
}