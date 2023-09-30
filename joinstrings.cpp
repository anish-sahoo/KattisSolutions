#include <iostream>
#include <string>
#include <vector>

int main() {
    int n;
    std::cin >> n;
    std::vector<std::string> arr(n);
    for (int i = 0; i < n; i++) {
        std::cin >> arr[i];
    }

    for (auto i = 0; i < n-1; i++)
    {
        int a,b;
        std::cin >> a >> b;
        arr[a-1] = arr[a-1] + arr[b-1];
        arr[b-1] = "";
    }

    for(auto i = 0; i < n; i++)
    {
        if(arr[i] != "")
        {
            std::cout << arr[i] << std::endl;
        }
    }   
    return 0;
}