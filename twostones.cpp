#include <iostream>

using namespace std;

int main(){
    int num;
    cin>>num;
    while(num > 2){
        num -= 2;
    }
    
    if(num == 1)
        cout<<"Alice"<<endl;
    else cout<<"Bob"<<endl;
    return 0;
}