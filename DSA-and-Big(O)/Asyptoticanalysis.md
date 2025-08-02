# Asymptotic Notation 🪡
---
- *`Big-O Notation`*  : (O-notation)   Represent The upper bound of the running Time of an Algotithm .  It gives the *`Worst-Case Complexity`* of an algorithm.
  
- *`Omega Notation`*  : ( Ω-notation)   Represent The Lower bound of the running Time of an Algotithm .  It provides the *`best-Case Complexity`* of an algorithm.
  
- *`Theta Notation`*  : (θ-notation)   Represent The upper an lower  bound of the running Time of an Algotithm .  It Used for analyzing  the *`Average-Case Complexity`* of an algorithm.


# Big-O Notations ⛓️‍💥  
--- 

- #### **O(1)** - Contest
- #### **O(log N )** - Logarithmic
- #### **O(N)** - Linear
- #### **O(N log N)** - Linearithmic
- #### **O(N^c)** - Polynomial Like Quadratic (N^2) , Cubic (N^3) etc
- #### **O(c^N)** - Exponential (2^N)
- #### **O(N!)**  - Factorial


  ![1_dWet_YU-5072Kcko7LzsuQ](https://github.com/user-attachments/assets/80a8dbed-b153-4249-b1c8-b217e67493bc)

##  O(1) - Contest Runtime Complexity :  
--- 
- Always Take the Same Amount of Time to be executed
- Input  Size doesn't matter. Comlexity remains the same
- For Exmples accessing an element from an array at a given index This will Run Only once which is a constant.

```java
int [] numbers =  new int[] {10,20,30,40} ;
System.out.println (numbers[1]) ; 
``` 

## O(logN) -Logarithmic Runtime Complexity   
- Complexity goes up linearly while the input geos up exponentially
- O(log N) Notatio is more scalable then O(N) and O(N^2) as the input Size grows larger and larger.
- For Exmple . Log to Base 3

```java
int n  =  10 ;
for (int i = 1; i < n ; i = i*10) {
System.out.println(i);
}
``` 


## O(N) -Linear Runtime Complexity      
- The time to execute the Algorithm is directly propotional to the input size n.
- Complexity grows linearly over time as the number of imputs increases . Higher the number of inputs the higher Complexity.
- For example . looping over all the items of an array.

```java
int [] numbers =  new int [] {10,20,30,40];
for (int i = 0; i<n numbers.length; i++) {
System.out.println(numbers[i]) ;
}
``` 

## O(NlogN) -Linearithmic  Runtime Complexity   

- The time to execute thye algorithm will grow at a rate that is between linear and exponential.
- Faster than linear but slower than exponential .
- For example : Merg sort quicksort and Heasport.

```java
int n = 10;
for ( int i = 1 ; i <= n; i++) {
  for (int j = 1; j < n; j = j * 2 ) {v
    System.out.println(i + " " + j) ;}
}
``` 
## O(N^c) -Polynomial  Runtime Complexity   
- The Time to execute the algorithme is directly proportional thye power (c) of the input size n.
- Like in Quadratic it is th square of input size n .
- For Exmple, Iteration of nested loops.

```java
int n = 10 ;
for ( int i = 0 ;  i  < n ; i++ ){
for ( int j = 0  ; j  <= i ;  j++) {
System.out.println(n) ;}
}
``` 

## O(C^N) -Exponential  Runtime Complexity      

-  The Time to execute the algorithm becomes double with each addition to the input dataset .
-  These are often recursive algorithm that Solve a problem of size N by recursivley solving two smaller prolems of size N - 1
-  For Exmple . Generating a Fibonacci Numbers using recursion.

  ```java
public int Fibonacci (int n) {
  if (n <= 1) {
      return n ;
   }
  else {
      return Fibonacci(n-2) + Fibonacci (n-1) ; }
} 
``` 

## O(N!) -Factorial Runtime Complexity   

- The Runtime for calculating factorial grows exponentially with the nnumber of inputs.
    -  For example , 5! IS 120 While 10!is 3628800
    
- Grows pretty quickly. this algorithm has the worst time complexity
- For Example :
    - Permutations of a string
    - Solving the travelling salesman problem with a brute force Search :

```java
int n = 10 ;
for (int i = 1; i <= factorial(n); i++) {
  System.out.println(i);}
``` 





# Big-O Notation Algorihm Examples 
---   

- *`Constant O(1) `* - Accessing an element in an Array by index number.
- *`Linear O(N) `* - Linear Search
- *`Logarithmic O(LOG N)`* - Binary Search
- *`Linearithmic O( N LOG N)`* - Heap Sort, Merge Sort
- *`Polynomial O(N^c) `* - Bubble Sort , Selection Sort , Bucket Sort
- *`Exponential O(c^N) `* - Tower of Hanoi
- *`Factorial O(N!)`* - Permutations of a String , Brute Force Search algorithm for traveling Salesman Problem.

# Problem Solving Techniques 

- *`Single and Nested loops `*
- *`Decrease and Conquer. Devide and Conquer Transform and Conquer `*
- *`Binary Search `*
- *`Two Pointers and Sliding Window `*
-  *`Breath First Search and Depth First Search `*
- *`Data Structures: Stackes , Queue, Hach Table, Trie, Heaps, BST etc `*
-  *`Dynamic Programming `*
- *`Greedy Algorithms `*








<img width="1280" height="720" alt="Do it Go to the Secend Slideis just a step" src="https://github.com/user-attachments/assets/abe4e6f2-34a8-4fbc-a82d-53e76d25402c" />











