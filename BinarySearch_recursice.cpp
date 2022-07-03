#include<iostream>
#include<vector>
using namespace std;

int binarysearch(vector<int> arr,int key,int low,int high){
    if(high>=low){
        int mid=low+(high-low)/2;
        if(arr[mid]==key)
            return mid;
        else if(key<arr[mid])
            return binarysearch(arr,key,low,mid-1);
        else
            return binarysearch(arr,key,mid+1,high);
    }
    return -1;
}
int main(){
    vector <int> arr={10,20,25,30,45,60};
    cout<<binarysearch(arr,23,0,arr.size());
}
