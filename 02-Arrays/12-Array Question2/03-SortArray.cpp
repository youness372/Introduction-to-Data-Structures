#include<iostream>
using namespace std ;

void SortArray(int arr[] , int N)  {
     int low = 0  ;
     int mid = 0   ;
     int high = N - 1 ;
     int temp ; 
     while (mid <= high)  {
       switch(arr[mid]) {
          case 0 :
            temp = arr[low] ;
            arr[low] = arr[mid] ;
            arr[mid] = temp ;
            low++ ;
            mid++ ;
            break ;   
          case 1 :
            mid++;
            break ;  
          case 2 :
            temp =  arr[mid] ;
            arr[mid] = arr[high] ;
            arr[high] = temp ;
            high--;
            break ; 
          } 
       }
  }      

int main() {

   int arr []  =  {0,1,2,0,0,1} ;
   int   N = sizeof(arr)  /  sizeof(arr[0])  ;
   SortArray(arr,N) ;

   for (int i = 0 ;  i < N ;i++) {
       cout << arr[i] << endl ;   
}


} 
