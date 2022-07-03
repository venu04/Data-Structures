#include<iostream>
#include<vector>
using namespace std;

int binarysearch(vector<int> arr,int key){
    int low=0;
    int high=arr.size();
    int mid;
    while(low<=high){
        mid=low+(high-low)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
}
int main(){
    vector <int> arr={10,20,25,30,45,60};
    cout<<binarysearch(arr,25);
}
