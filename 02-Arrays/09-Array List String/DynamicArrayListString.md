#  *Array List String*   

#### *We have an Array List of Strings we can declare it like that* 
---
<img width="698" height="283" alt="image" src="https://github.com/user-attachments/assets/e4a39726-b34a-45fe-8583-33093abaf7ce" />



```java
import java.util.ArrayList ;   
public class ArrayListString {
  public static vois main(String[] args)  {
    ArrayList<String> fruits = new ArrayList<String>() ;
    fruits.add("Apple")  ;
    fruits.add("Banana") ;
    fruits.add("Mango") ;
    fruits.add("Grapes") ;
    fruits.add("Orange") ;   
 }
}
```
#### *Get An Element from the Array List Using The Index*    
---

<img width="572" height="515" alt="image" src="https://github.com/user-attachments/assets/736d62f5-4362-4aa0-8153-0c756c831816" />


```java
import java.util.ArrayList ;   
public class ArrayListString {
  public static vois main(String[] args)  {
    ArrayList<String> fruits = new ArrayList<String>() ;
    fruits.add("Apple")  ;
    fruits.add("Banana") ;
    fruits.add("Mango") ;
    fruits.add("Grapes") ;
    fruits.add("Orange") ;

    System.out.println("The index 0 : " + fruits.get(index:0)) ;   
    System.out.println("The index 1 : " + fruits.get(index:1));
    System.out.println("The index 2 : " + fruits.get(index:2));
    System.out.println("The index 3 : " + fruits.get(index:3));

 }
}
```

#### *Check if the Array Contains an Element*   
--- 

<img width="639" height="546" alt="image" src="https://github.com/user-attachments/assets/a526923c-0cea-4241-a142-6fac07dca4e7" />


```java
import java.util.ArrayList ;   
public class ArrayListString {
  public static vois main(String[] args )  {
    ArrayList<String> fruits = new ArrayList<String>() ;
    fruits.add("Apple")  ;
    fruits.add("Banana") ;
    fruits.add("Mango") ;
    fruits.add("Grapes") ;
    fruits.add("Orange") ;

    boolean Exist = fruits.contains("Mango");
    System.out.println(Exist) ;  
 }
}
```

####  *The Size of an Array list*  
---  

```java
import java.util.ArrayList ;   
public class ArrayListString {
  public static vois main(String[] args )  {
    ArrayList<String> fruits = new ArrayList<String>() ;
    fruits.add("Apple")  ;
    fruits.add("Banana") ;
    fruits.add("Mango") ;
    fruits.add("Grapes") ;
    fruits.add("Orange") ;

    int ArraySize  = fruits.Size();
    System.out.println("The Array size is :" + ArraySize) ;  
 }
}
```


#### *Check if the Array is Empty*   
---

```java
import java.util.ArrayList ;   
public class ArrayListString {
  public static vois main(String[] args )  {
    ArrayList<String> fruits = new ArrayList<String>() ;
    fruits.add("Apple")  ;
    fruits.add("Banana") ;
    fruits.add("Mango") ;
    fruits.add("Grapes") ;
    fruits.add("Orange") ;

    boolean isEmpty = fruits.isEmpty("Mango");
    System.out.println(isEmpty) ;   
 }
}
```


#### *To Remove all the elements of the Array we use  `clear()`*
---   

```java
import java.util.ArrayList ;   
public class ArrayListString {
  public static vois main(String[] args )  {
    ArrayList<String> fruits = new ArrayList<String>() ;
    fruits.add("Apple")  ;
    fruits.add("Banana") ;
    fruits.add("Mango") ;
    fruits.add("Grapes") ;
    fruits.add("Orange") ;

    fruits.clear() ;
    System.out.println(fruits);
  
 }
}
```

#### *I hope i was helpful see you soon*   


<img width="540" height="355" alt="Hope you enjoyed this part  See what's next!" src="https://github.com/user-attachments/assets/463ff504-3ac6-4c83-ade7-1c13043569a9" />

