#include<iostream>
using namespace std;



void OddEven(int n)
{
    if(n&1)
    cout<<"odd";
    else
    cout<<"even";
}

int main()
{
    int n;
    cin>>n;

    OddEven(n);
}