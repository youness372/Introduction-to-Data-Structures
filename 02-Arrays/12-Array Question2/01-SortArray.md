#  *Sort Array  using Dutch (National Flag Algorithm) 🪨*     
--- 
##  *The Problem 🔗*   
####  Gevin an Array arr[]  of Size N Containing only `0S`, `1S` and `2S` Sorting The Array in Ascending Order.   

### *Examples*      

- *input*  :    `arr[] = {0,1,1,0,0,2}` , `N = 6`
- *output* : `{0,0,0,1,1,2}`  
  - OS, 1S, 2S, are Segregated into Ascending Order.
  
- *input*  :    `arr[] = {0,1,0}` , `N = 3`
- *output* : `{0,0,1}`
  - OS, 1S, 2S, are Segregated into Ascending Order.

##  *Explanation ⛓️‍💥*      

- *`low = 0 `*
- *`mid = 0 `*
- *`high =  arr.length - 1 `*

<img width="1218" height="711" alt="image" src="https://github.com/user-attachments/assets/800a60b0-63a9-4ec6-953e-bbdab3cf980e" />


## *Solution  💻*   
--- 

### *`Java`*   

```java
public class Question2 {
     static void SortedArray  (int arr[] , int n   ) {
             int low = 0  ;     
             int mid = 0  ;     
             int  high =  n -  1 ;    
            while (mid <=  high)  {
                switch (arr[mid]) {
                    case 0 :
                        int temp =  arr[low]  ;
                        arr[low] =  arr[mid] ;
                        arr[mid] =  temp ;

                        low++;
                        mid++ ;
                        break;
                    case 1 :
                        mid++;
                        break;
                    case 2 :
                        temp  =  arr[mid]  ;
                        arr[mid] =  arr[high]  ;
                        arr[high] =  temp ;
                        high--;
                        break;
                }
            }
     }
    public static void main(String[] args) {
         int arr[] =  {0,1,2,0,0,1} ;
         int n =  arr.length ;
         SortedArray(arr,n);
         for (int i = 0 ; i < n ;   i++)  {

             System.out.println(arr[i]);
         }
    }
}

```


### *`C++`*   


```cpp
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
```


### *`Python`*     

```py
def SortArray (arr , N ):
  low , mid , high = 0, 0, N-1
  while mid <= high :
        if arr[mid] == 0  :
            temp = arr[low]
            arr[low] = arr[mid]
            arr[mid] = temp

            low +=  1
            mid +=  1
        elif arr[mid] ==  1  :
            mid +=  1
        elif arr[mid] == 2 :
            temp  =  arr[mid]
            arr[mid] = arr[high]
            arr[high] = temp
            high -=  1
arr =  [0,1,2,0,0,1]
N =  len(arr)
SortArray(arr,N)
print(arr)       

```




### *I hope That was Helpful*   



<img width="500" height="350" alt="Hope you enjoyed this part  See what's next!" src="https://github.com/user-attachments/assets/fd9f4d49-86a0-4f03-a702-6fc282d91799" />
