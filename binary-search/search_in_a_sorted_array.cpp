#include<iostream>
using namespace std;

int binarySearch(int arr[], int size, int key) {

    int start = 0;
    int end = size-1;

    int mid = start + (end-start)/2;
    // m = (start + end)/2 can lead to overflow for large values of start and end;

    while(start <= end) {

        if(arr[mid] == key) {
            return mid;
        }

        //search in the right part
        if(key > arr[mid]) {
            start = mid + 1;
        }
        else{ // search in the left part 
            end = mid - 1;
        }
        mid = start + (end-start)/2;
    }
    
    return -1; // element not found 
}
int main()
{
    int arr[7] = {1,3,7,9,10,15,23};
    int key;
    cout<<"Enter element to search : "; 
    cin>>key;
    int index = binarySearch(arr, 7, key);

    //if index = -1 => element not present 
    // else index represent the element in the array (zero based indexing)
    cout<<index<<endl; 
}