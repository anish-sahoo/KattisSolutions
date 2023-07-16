//https://open.kattis.com/problems/everywhere
#include <iostream>
#include <set>

using namespace std;

int main(){
    int a, n;
    string place;
    set<string> places;
    cin>>a;
    for (int i = 0; i < a; i++) {
        cin>>n;
        while(n-- > 0){
            cin>>place;
            places.insert(place);
        }
        cout<<places.size()<<endl;
        places.clear();
    }
    return 0;
}