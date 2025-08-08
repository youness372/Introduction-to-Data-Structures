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

<img width="1490" height="420" alt="image" src="https://github.com/user-attachments/assets/ae133518-1a4e-429b-a699-cd6e61adbd63" />

<img width="1405" height="691" alt="image" src="https://github.com/user-attachments/assets/4c37cba2-de54-4804-8cd1-8ebbb4c69ca9" />

<img width="1336" height="896" alt="image" src="https://github.com/user-attachments/assets/a90f6830-9701-4830-8888-eb8d5c27203d" />

<img width="1419" height="571" alt="image" src="https://github.com/user-attachments/assets/d497e46d-e0af-4f3c-b718-86620e321ecd" />

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






 
