#include <iostream>
#include <string>

using namespace std;

int main(){
    string a;
    cin>>a;
    string p = "PER";
    int counter{0};
    for (auto i = 0; i < a.length(); i++) {
        if(a[i] != p[i%3]){
            counter++;
        }
    }
    cout<<counter<<endl;
}