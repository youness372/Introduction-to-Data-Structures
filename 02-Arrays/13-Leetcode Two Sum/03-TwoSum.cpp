#include<iostream>
using namespace std ;

int* TwoSum  (int nums[],int n ,  int Target)  {
        int* indeces =  new int[2] ;
       for (int i = 0 ;  i  < n -1 ; i++)  {
         for( int j  = i +1 ;  j < n  ;  j++)  {
             if (nums[i]  + nums[j]  ==  Target)  {
                  indeces[0] = i ;
                  indeces[1] = j ; 
                  return indeces ;
                  }
            }  
        }
      return nullptr; 
  }
int main() {
  
  int nums [] = {10,20,30,40,50} ;
  int n =  sizeof(nums)  / sizeof(nums[0])  ;
  int Target =  70 ;
  int*  result =  TwoSum(nums , n , Target)  ;
   if (result != nullptr) {
            cout << "Indices: " <<  result[0] << ", " << result[1]  << endl  ;
            delete[] result ;  
        } else {
            cout << "No two sum solution found." << endl ;
        }
     return  0 ; 
 } 
