#include<iostream>
#include<queue>
#include<vector>
using namespace std;

int solve(vector<int>nums)
{
    int sum=0;
    int a,b;
    priority_queue<int,vector<int>,greater<int>>pq;
    for(int i=0;i<nums.size();i++)
    {
        pq.push(nums[i]);
    }

    while(pq.size()>1)
    {
        a=pq.top();
        pq.pop();
        b=pq.top();
        pq.pop();
        a+=b;
        sum+=a;
        pq.push(a);
    }

    return sum;
}


int main()
{
     vector<int> vect{1, 2, 3, 4, 5};
    
    cout << (solve(vect));
}
