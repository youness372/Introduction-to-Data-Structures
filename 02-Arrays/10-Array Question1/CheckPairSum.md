#  *The Problem 🔬*   

####  Given an Array `arr[]` of n numbers and another number `X` this Task is to ckeck Whether or not There Exist Two elements in `arr[]`  whose `SUM` is exactly X.    

## *Examples*    

- input  `arr[] = {0,-1,2,-3,1}`   ,  `X = -2`    
- output : True 
  -  X is the SUM of -3 + 1 =  -2 = X 

- input  `arr[] = {1,-2,1,0,5}`   ,  `X = 0`     
-  output : False


##  *we Have A two Solution deffrend in this Problem*     
  - *`1️⃣ Using Loop instead loop`* 
  - *`2️⃣ Using a Hash Set`*


##  *Approach The Loop instaed loop*      

<img width="1242" height="592" alt="image" src="https://github.com/user-attachments/assets/159f1ddb-2514-4d32-89dd-df36ac176b73" />

##  *The Complexity*   
  - *Time Complexity*  $$O(N^2)$$ 
  - *Space Complexity* $$O(N)$$    

##  *The First Solution using (Java , c++ , python)*  

### *`Java`*   

```java
public class ArrayQuestion  {
  static boolean hasPairSum(int arr[], int size,  int Target){

     for (int i = 0; i < (size - 1); i++)  {
       for (int j = i+1; j < size; j++) {
         if (arr[i] + arr[j] == Target) {
            return  true ;  
          }
      }
  }
     return false ;  
 }
public static void main (String[] args)  {
    int arr[]  = {0, -1, 2, -3, 1} ;
    int size =  arr.length ;
    int Target  =  -2;
    if (hasPairSum(arr , size , Target) {
      System.out.println("yes there is a pair of sum equal to :" + Target) ;   
    }
    else {
      System.out.println("there is not a pair of sum equal to : " + Target);
   } 
  }
} 
```

### *`C++`*  
```cpp
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
```

### *`Python`*   
```py

def hasPairSum(arr, size, Target) :
  for i in range (len(arr)-1) :
    for j in range (i+1 , len(arr)) :
      if arr[i] + arr[j] == Target :
          return  True
  return False
arr =  [0,-1,2,-3,1]
size = len(arr)
Target = -2
if hasPairSum (arr , size , Target)  :
    print("the sum of two elements in the array equal to Target is : " , Target)
else :
    print("the sum of two elements in the array equal to Target is : " ,Target)
```


##  *Approach Using a Hash Set*      

<img width="988" height="584" alt="image" src="https://github.com/user-attachments/assets/a3f738c5-e04d-4df3-8182-c117f09b516f" />

##  *The Complexity*   
  - *Time Complexity*  $$O(N)$$ 
  - *Space Complexity* $$O(N)$$    

##  *The First Solution using (Java , c++ , python)*  

### *`Java`*   

```java
public class ArrayQuestion1 {
    static  boolean  HaspairSum(int arr[] , int size ,  int Target)  {
        int min  =  Integer.MAX_VALUE ;
        int max  =  Integer.MIN_VALUE ;
        for (int i = 0 ;  i < size; i++  )  {
            if (arr[i]  > max )  {
                max  =  arr[i] ;
            }
            if (arr[i] < min) {
                min = arr[i]  ;
            }
        }
        boolean[]  visited =  new boolean[max - min +1 ] ;
        for (int i = 0 ; i < size ; i++)  {
            int complement = Target -  arr[i]  ;
            if ( complement  >=  min && complement <= max &&  visited[complement - min]) {
                return   true ;
            }
            visited[arr[i] - min ] =  true ;
        }
        return  false ;
    }
public static void main(String[] args) {
     int arr[] = {0,-1,2,-3,1} ;
     int size =  arr.length ;
     int Target = -2 ;
     if (HaspairSum(arr,size , targetSum);) {
      System.out.println("yes there is a pair of sum equal to :" + Target) ;   
    }
    else {
      System.out.println("there is not a pair of sum equal to : " + Target);
   } 
 }
}
```


### *`C++`*   

```cpp
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


```


### *Python*   

```py
def HasPairSum(arr, size, Target) :
   max = float('-inf')
   min = float('inf')
   for i in arr :
      if i > max :
          max =  i
      if i < min :
          min = i
   visited = [False] * (max - min +1)
   for i in range (size) :
      complement =  Target - arr[i]
      if complement >= min and complement <= max and visited[complement - min] :
          return True
      visited[arr[i] - min] = True
   return False

arr =  [0,-1,2,-3,1]
size =  len(arr)
Target = -2
if HasPairSum(arr, size, Target) :
     print ("Found a pair that sums to Target: true" , Target)
else :
     print ("Found a pair that sums to Target: false" ,Target)

```   


### *I hope That Was Helpful*   


<img width="500" height="350" alt="Hope you enjoyed this part  See what's next!" src="https://github.com/user-attachments/assets/75ac5998-0800-47f8-af67-b246528a036b" />
