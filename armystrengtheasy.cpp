#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;   

int main() {
    int t;
    int mechaSize;
    int godzillaSize;
    
    cin>>t;

    while(t-- > 0){
        cin>>godzillaSize;
        cin>>mechaSize;

        vector<int> godzillaArmy, mechaArmy;

        for (int i = 0; i < godzillaSize; i++) {
            int a;
            cin>>a;
            godzillaArmy.push_back(a);
        }
        
        for (int i = 0; i < mechaSize; i++) {
            int a;
            cin>>a;
            mechaArmy.push_back(a);
        }

        sort(godzillaArmy.begin(), godzillaArmy.end());
        sort(mechaArmy.begin(), mechaArmy.end());
        int count;

        while(!godzillaArmy.empty() || !mechaArmy.empty()){
            if(godzillaArmy.empty()){
                cout<<"MechaGodzilla"<<endl;
                count++;
                break;
            }
            if(mechaArmy.empty()){
                cout<<"Godzilla"<<endl;
                count++;
                break;
            }

            int m_weakest = mechaArmy.at(0);
            int g_weakest = godzillaArmy.at(0);

            if(g_weakest < m_weakest){
                godzillaArmy.erase(godzillaArmy.begin());
            }
            else mechaArmy.erase(mechaArmy.begin());
        }

        if(count == 0){
            cout<<"uncertain"<<endl;
        }
    }
    return 0;
}
