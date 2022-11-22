#include<iostream>
#include<unordered_map>
using namespace std;

class Node
{
    public:
    int data;
    Node *next;
};

class LinkedList
{
    private:
    Node *first;

    public:
    LinkedList(){
        first=NULL;
    }
    void CreateList(int A[],int n);
    void hasCycle(Node *first);
    void CreateCycle(Node *p);
    Node *getPointer(){
        return first;
    }

};


void LinkedList::CreateList(int A[],int n)
{
    first=new Node;
    first->data=A[0];
    first->next=NULL;
    Node *p,*last;
    last=first;
    for(int i=1;i<n;i++)
    {
        p=new Node;
        p->data=A[i];
        p->next=NULL;
        last->next=p;
        last=p;
        
    }
}


void LinkedList::hasCycle(Node *p)
{
    unordered_map<Node*,bool>hashTable;

    Node *temp=p;
    while(temp!=NULL)
    {
        if(hashTable.count(temp)!=0)
        {
            cout<<"Cycle Exist";
            return;
        }
        hashTable[temp]=true;
        temp=temp->next;
        
    }

    cout<<"cycle does not exist";
}

void LinkedList::CreateCycle(Node *p)
{
    Node *temp=p;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }

    temp->next=p;
}


int main()
{
    int A[5]={10,15,25,40,21};
    LinkedList ll;
    ll.CreateList(A,5);
    ll.CreateCycle(ll.getPointer());
    ll.hasCycle(ll.getPointer());
}

