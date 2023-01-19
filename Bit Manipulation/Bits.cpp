#include<iostream>
using namespace std;

int getBit(int n,int i)
{
    int mask=1<<i;
    if((n&mask)>0)
    return 1;
    else
    return 0;
}

int clearBit(int n,int i)
{
    int mask=~(1<<i);
    return n&mask;
}

int setBit(int n,int i)
{
    int mask=1<<i;
    return (n|mask);

}

int updateBit(int n,int i,int v)
{
    n=clearBit(n,i);
    int mask=(v<<i);
    return (n|mask);
}


int clearLastBits(int n,int i)
{
    int mask=(-1<<i);

    return n&mask;
}

int clearRangeOfBits(int n,int i,int j)
{
    int a=(-1<<(j+1));
    int b=(1<<i)-1;
    int mask=a|b;
    return n&mask;
}



int main()
{
    //get number
    int n;
    cin>>n;

    //Get ith Bit
    // int i;
    // cin>>i;
    // cout<<getBit(n,i);


    //clear ith Bit
    // int i;
    // cin>>i;
    // cout<<clearBit(n,i);

    //Set ith Bit
    // int i;
    // cin>>i;
    // cout<<setBit(n,i);


    //update ith Bit
    // int i,v;
    // cin>>i>>v;
    // cout<<updateBit(n,i,v);


    //clear Last i Bits
    // int i;
    // cin>>i;
    // cout<<clearLastBits(n,i);

    //clear range of Bits
    int i,j;
    cin>>i>>j;
    cout<<clearRangeOfBits(n,i,j);

}