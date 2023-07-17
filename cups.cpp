#include <iostream>
#include <map>
#include <algorithm>
#include <vector>

using namespace std;

int main(){
    int num;
    cin>>num;
    map<int, string> m;

    while(num-- > 0){
        int r;
        string color;

        cin.ignore();
        if(isalpha(cin.peek())){
            cin>>color>>r;
        }
        else {
            cin>>r>>color;
            r = r/2;
        }
        //cout<<"Color = "<<color<<", Radius = "<<r<<endl;
        m.insert({r, color});
    }
    for (const auto& pair : m) {
        cout << pair.second << endl;
    }
    return 0;
}