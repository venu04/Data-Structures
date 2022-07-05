#include <iostream>

using namespace std;

int a[]={-6,12,-22,8,4,3,1};
int b[sizeof(a)/sizeof(a[1])];

void merge(int s,int m,int e){
    int i=s;
    int j=m+1;
    int k=s;
    while(i<=m && j<=e){
        if(a[i]<a[j]){
            b[k++]=a[i++];
        }
        else{
            b[k++]=a[j++];
        }
    }
    while(i<=m)
    {
        b[k++]=a[i++];
    }
    while(j<=e){
        b[k++]=a[j++];
    }
    for(i=s;i<k;i++)
    {
        a[i]=b[i];
    }
}

void mergesort(int s,int e){
    int mid=s+(e-s)/2;
    if(s>=e){
        return;
    }
    mergesort(s,mid);
    mergesort(mid+1,e);
    merge(s,mid,e);
}

int main()
{
    mergesort(0,(sizeof(a)/sizeof(a[1])-1));
    for(int i=0;i<sizeof(a)/sizeof(a[1]);i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;
}
