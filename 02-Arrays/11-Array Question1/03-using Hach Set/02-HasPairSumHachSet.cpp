#include<iostream>
#include <climits>
#include <vector> 
using namespace std ;

bool  hasPairSum(int arr[] , int size , int Target){
    int min = INT_MAX ;
    int max =  INT_MIN ;
    for (int i = 0 ;  i < size ; i++) {
       if (arr[i] > max ) {
          max = arr[i];
        }
      if (arr[i] < min ) {
          min =  arr[i] ;   
        }
    }

  std::vector<bool> visited(max - min +1 , false);
  for (int i = 0; i < size; i++) {
      int complement =  Target - arr[i]  ;
      if (complement >=  min &&  complement  <= max &&  visited[complement - min]) {
              return true ;   
   }
    visited[arr[i] - min ] =  true ;
 }
 return  false ;  
}

int main() {
   int arr[] = {0, -1, 2, -3, 1} ;
   int size =  sizeof(arr) /  sizeof(arr[0]) ;
   int Target = -2 ;
   bool  result =  hasPairSum(arr , size , Target) ;
   if (result == true) {
     cout <<  "Found a pair that sums to Target: true " << boolalpha <<  result << endl ;   
  }
  else {
     cout << "Found a pair that sums to Target:  false" << boolalpha <<  result << endl ;   
}
}

