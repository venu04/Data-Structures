/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int a[]={9,5,1,3,2,7,8};
int b[sizeof(a)/sizeof(a[1])];

void merge(int s,int m,int e){
    int i=s;
    int j=m+1;
    int k=s;
    while(i<=m and j<=e){
        if(a[i]<a[j]){
            b[k]=a[i];
            k++;
            i++;
        }
        else{
            b[k]=a[j];
            j++;
            k++;
        }
    }
    while(i<=m){
        b[k]=a[i];
        k++;
        i++;
    }
    while(j<=e){
        b[k]=a[j];
        k++;
        j++;
    }
    for(i=s;i<=e;i++)
    {
        a[i]=b[i];
    }
}

void mergesort(int s,int e){
    int mid=s+(e-s)/2;
    if(s>=e)
    {
        return;
    }
    mergesort(s,mid);
    mergesort(mid+1,e);
    merge(s,mid,e);
}

int main()
{
    int arr[]={10,5,2,7,3,4};
    mergesort(0,6);
    for(int i=0;i<sizeof(a)/sizeof(a[1]);i++){
        cout<<a[i]<<" ";
    }

    return 0;
}
