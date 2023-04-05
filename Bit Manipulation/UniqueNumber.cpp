#include<iostream>
#include<vector>
using namespace std;


int UniqueNumber1(vector<int>vect)
{
    int tempXOR=0;

    for(int i=0;i<vect.size();i++)
    {
        tempXOR=tempXOR^vect[i];
    }

    return tempXOR;
}


void UniqueNumber2(vector<int>vect)
{

    //XOR of all the numbers
    int tempXOR=0;
    for(int i=0;i<vect.size();i++)
    {
        tempXOR=tempXOR^vect[i];
    }

    //find position of ith Bit

    int pos=0;
    int temp=tempXOR;
    while((temp&1)==0)
    {
        pos++;
        temp>>1;
    }

    int setA=0;
    int setB=0;
    int mask=1<<pos;

    for(int i=0;i<vect.size();i++)
    {
        if((vect[i]&mask)==0)
        {
            setA=setA^vect[i];
        }
        else
        {
            setB=setB^vect[i];
        }
        
    }

    cout<<setA<<endl;
    cout<<setB<<endl;
    
}






void updateSum(vector<int>&sumArr,int x)
{
    for(int i=0;i<32;i++)
    {
        int ithBit=x&(1<<i);

        if(ithBit)
        {
            sumArr[i]++;
        }
    }

}


int UniqueNumber3(vector<int>vect)
{
    vector<int>sumArr(32,0);

    for(int i=0;i<vect.size();i++)
    {
        updateSum(sumArr,vect[i]);
    }

    for(int i=0;i<32;i++)
    {
        sumArr[i]=sumArr[i]%3;
    }

    int n=0;
    for(int i=0;i<32;i++)
    {
        n+=(sumArr[i]*(1<<i));
    }

    return n;




}

int main()
{
    // vector<int>vect{5,10,3,10,5,3,4};
    // cout<<"Unique Number 1"<<endl;
    // cout<<UniqueNumber1(vect)<<endl;   //if there is only one unique number and other number are repeating twice (2N+1)


    // cout<<"Unique Number 2"<<endl;
    // vector<int>vect2{5,10,3,10,5,3,4,9};  //if there is 2 unique number and other number are repeating twice (2N+2)
    // UniqueNumber2(vect2);

    cout<<"Unique Number 3"<<endl;
    vector<int>vect3{5,5,5,10,10,10,2,2,2,3,4,4,4};   //One Unique number and other number are repeating thrice (3N+1)
    cout<<UniqueNumber3(vect3);
}