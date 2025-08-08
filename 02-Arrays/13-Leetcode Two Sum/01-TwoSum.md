# *Leetcode Question Two Sum*   
---   


### in This Problem we can use A two Solution     

  - *`1️⃣ Using loop Instead loop`*
  - *`2️⃣ using Two Pointer Algorithm`*

## *The problem Desception* :   
  - https://leetcode.com/problems/two-sum/description/
### *Explaining The first methode (loop instead loop) ➿*   

<img width="900" height="600" alt="image" src="https://github.com/user-attachments/assets/9b870d92-d9f2-4a2d-a7aa-e2d4725016b0" />


## *The Solution Using (Java , C++, Python)*    

### *Java*   
```java
import  java.util.ArrayList ;   
public class TwoSum  {

  public static int [] TwoSum(int nums[]  ,  int Target)(
     int n  = nums.length ;
     int [] indeces =  new int[2] ;     
     for (int i = 0 ;  i  < n -1 ; i++)  {
         for( int j  = i +1 ;  j < n  ;  j++)  {
             if (nums[i]  + nums[j]  ==  Target)  {
                  indeces[0] = i ;
                  indeces[1] = j ; 
                  return indeces ;
                  }
            }  
        }
      return null; 
  }

public static void main (String[] args)  {
        int []  nums = {10,20,30,40,50} ;
        int Target = 70 ;
        int []  result = TwoSum (arr , Target)  ;
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
        
}
}

```


### *C++*    


```cpp
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

```

### *Puython*    


```py

def Twosum (nums, Target) :
  n =  len(nums)
  for i in range (n-1):
    for j in range (i+1,n) :
      if nums[i]  + nums[j] ==  Target :
         return [i,j]
  return None

nums =  [10,20,30,40,50]
Target =  70
result = TwoSum(nums , Target)
if result is not  None :
    print (""Indices: " ,result[0] ,", " , result[1]" )
else :
  print ("No two sum solution found.")

```



## *The Solution Using Two pointer*     
--- 
<img width="930" height="620" alt="Screenshot 2025-08-08 230244" src="https://github.com/user-attachments/assets/3c119234-907b-4509-a312-908f857ffa8f" />

<img width="930" height="620" alt="Screenshot 2025-08-08 230307" src="https://github.com/user-attachments/assets/84c9ddb5-11d2-4458-8227-518a426b7d5d" />
<img width="930" height="620" alt="Screenshot 2025-08-08 230325" src="https://github.com/user-attachments/assets/54daba3b-5db4-45d7-9b36-3b53728e4a9c" />
<img width="930" height="320" alt="Screenshot 2025-08-08 230336" src="https://github.com/user-attachments/assets/9cfa17bb-2766-4764-9918-403a4fac7f11" />
<img width="930" height="620" alt="image" src="https://github.com/user-attachments/assets/d404dbad-bce7-4867-86e7-7c3f757f1212" />

### *Java*   
```java
import java.util.Arrays;

public class TwoSum {


    static int []  TwoSum(int[] nums, int Target)  {

        int [] indecis = new int[2] ;
       int n = nums.length ;
       int left = 0  ;
       int right =   -  1 ;
       int [] Sortednums = Arrays.copyOf(nums , n) ;
       Arrays.sort(Sortednums);

       while (left < right) {

            int sum = Sortednums[left] + Sortednums[right] ;
            if (sum == Target) {

                 for (int i = 0 ;  i < n ; i++)  {
                     if (nums[i] == Sortednums[left]) {
                         indecis[0] = i ;
                         break;
                     }
                 }
                 for (int i = n-1 ; i >= 0; i--) {
                     if(nums[i] == Sortednums[right]) {
                         indecis[1] = i ;
                         break;
                     }
                 }
                 break;
            } else if (sum < Target) {
                left++;
            }
            else {
                right--;
            }

       }

   return indecis ;

    }


    public static void main(String[] args) {
        int [] nums =  {10,20,30,40,50} ;
        int Target = 50 ;
        int [] result = TwoSum(nums , Target) ;
        for (int i = 0 ; i < result.length;i++)  {
            System.out.println(result[i]);
        }
    }
}


```



<img width="500" height="350" alt="Hope you enjoyed this part  See what's next!" src="https://github.com/user-attachments/assets/ddd7ff64-af6b-45cb-aa35-5683d60212b4" />






 
