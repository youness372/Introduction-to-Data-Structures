#include<iostream>
using namespace std ;
bool  hasPairSum (int arr[] , int size  , int Target) {

     for (int i = 0; i< (size - 1 ); i++) {
        for (int j = i + 1 ; j < size; j++){
          if (arr[i]+arr[j] == Target){
             return true ;
           }
        }
    }
    return  false ;  
}
int main() {
   int arr[] = {0, -1, 2, -3, 1} ;
   int size =  sizeof(arr) /  sizeof(arr[0]) ;
   int Target = -2 ;
   bool  result =  hasPairSum(arr , size , Target) ;
   if (result == true) {
     cout <<  "Found a pair that sums to Target: true" << boolalpha <<  result << endl ;   
  }
  else {
     cout <<  "Found a pair that sums to Target: false" << boolalpha <<  result << endl ;   
}
}
