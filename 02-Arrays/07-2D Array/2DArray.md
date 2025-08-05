#  *2D Arrays*   
---   
 - 2D Arrays are simply a Couple of Arrays inside a larger Array  `Matrix`

<img width="346" height="158" alt="image" src="https://github.com/user-attachments/assets/9511826d-294b-4816-956f-7df853a848da" />

-  This Matrix we can Write it using Java :
```java
public class TwoDArray {
  public static void main (String[] args)  {
    int [][] matrix =  {
        {1,2,3},
        {4,5,6},
        {7,8,9} }
}}



```

<img width="700" height="440" alt="image" src="https://github.com/user-attachments/assets/464ff75c-26ae-4e49-a645-2403a628b932" />

###  *To see All The numbers in The Matrix we use*   

```java
public class TwoDArray {
  public static void main (String[] args)  {
  int [][] matrix =  {
      {1,2,3} ,
      {4,5,6} ,
      {7,8,9} } ;

  for (int i  = 0 ;  i < matrix.length; i++)  {
    for(int j = 0 ; i < matrix[i].length; j++) {
       System.out.println(matrix[i][j]+ " ") ;   }
    System.out.println() ; 
  }
 }
 }
```

### *I Hope That was Helpful*   

<img width="450" height="425" alt="Hope you enjoyed this part  See what's next!" src="https://github.com/user-attachments/assets/15f42f55-49e0-4c4a-88cb-4a232775297e" />
