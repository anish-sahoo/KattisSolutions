#include <iostream>

using namespace std;

int main(){
    int n;
    double sum;

    cin>>n;
    for (int i = 0; i < n; i++) {
        double a,b;
        cin>>a>>b;
        sum += a*b;
    }
    cout<<sum;
    return 0;
}