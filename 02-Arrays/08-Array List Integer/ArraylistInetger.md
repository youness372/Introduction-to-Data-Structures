#  *Array List Integer 🔗*   
--- 

####  *`add(element)`*    
  -  Insert the element in the end of the array.
```java
      ArrayList<Integer>  numbers = new ArrayList<Integer>() ;
      numbers.add(e:10) ;
```
####  *`add(int index , element)`*    
  - insert the element in specific index that gevin.

```java
      ArrayList<Integer>  numbers = new ArrayList<Integer>() ;
      numbers.add(index:2,element:40) ;
```
#### *`remove(int index)`*   
  - remove the element from the Array using the index.
```java
      ArrayList<Integer>  numbers = new ArrayList<Integer>() ;
      numbers.remove(index:2) ;
```
####  *`get(int index)`*  
  - Get the valeu from the Array Usinf the index.
```java
      ArrayList<Integer>  numbers = new ArrayList<Integer>() ;
      numbers.add(e:10) ;
      numbers.add(e:20) ;
      numbers.add(e:30) ;
      numbers.add(e:40) ;
      System.out.println(numbers.get(index:2)) ; 
```
#### *`set(int index , element)`*   
  - we use it if we wanna Replace some Position.

```java
      ArrayList<Integer>  numbers = new ArrayList<Integer>() ;
      numbers.add(e:10) ;
      numbers.add(e:20) ;
      numbers.add(e:30) ;
      numbers.add(e:40) ;
      numbers.set(index:2,element:25) ; 
```
#### *`size()`*    
  - we use it to know the Size of an Array.
```java
      ArrayList<Integer>  numbers = new ArrayList<Integer>() ;
      numbers.add(e:10) ;
      numbers.add(e:20) ;
      numbers.add(e:30) ;
      numbers.add(e:40) ;
      int size = numbers.size() ;   
      System.out.println("The size of The Arraylist is :" + size) ; 
```
#### *`isEmpty()`*   
  - we use it to check if Array list is Empty or not .




## *Example have all ths previous Cases*   

```java
import  java.util.ArrayList ; 
public class addEelemnetinLast {
  public static void main(String[] args)   {

      ArrayList<Integer>  numbers = new ArrayList<Integer>() ;

      // Add Elements to the Arraylist
      numbers.add(e:10) ;
      numbers.add(e:20) ;
      numbers.add(e:30) ;
      numbers.add(e:40) ;

      // Access The Elements from the Arraylist
      System.out.println ("The numers Array 0 : " + numbers.get(index:0)) ;
      System.out.println ("Element at Index 1 : " + numbers.get(index:1)) ;
      System.out.println ("The numers Array 2 : " + numbers.get(index:2)) ;

      // Update The value in Arraylist
      numbers.set (index:1, element:25) ;

      //Deletion of Element from ArrayList
      numbers.remove (index:2);

      // Get the Size 
      int size =  numbers.size() ;   
      System.out.println ("The size of numbers is : " + size) ;

      System.out.println ("The numers Array : " ) ;
      for (int i = 0  ; ì < numbers.size() ; i++) {
        System.out.println(numbers.get(index:i) ;   
       } 
  }
}

```

### *See you in the Next Section*   

<img width="500" height="350" alt="Hope you enjoyed this part  See what's next!" src="https://github.com/user-attachments/assets/3eed6d5e-5a9c-4df2-9696-7420dd6ccc7e" />
