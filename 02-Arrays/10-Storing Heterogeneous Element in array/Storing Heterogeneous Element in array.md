#  *Storing Heterogeneous Element in array ♻️*    

#### As we saw earlier, an array usually has a single type for all its elements. But what if an array can hold elements of different types? That’s what we call a heterogeneous type in Java.
 
<img width="599" height="537" alt="image" src="https://github.com/user-attachments/assets/72936beb-ba07-4235-9799-fe58a2dbdf70" />



###   *Example Using Java*     

```java
public class SortingHoterogeneusEelementInArray {

    public static void main(String[] args) {

    Object[]  data =  new Object[5] ;
    data[0] = "Hello World" ;
    data[1] = 16 ;
    data[2] = 15.80 ;
    data[3] = "A";
    data[4] = false ;
    for (int i = 0; i < data.length ; i++) {
      System.out.println(data[i]) ; 
  }

 }
}

```


### *Example of Using Array List*   

```java
import  java.util.ArrayList ;   
public class SortingHoterogeneusEelementInArray {

    public static void main(String[] args) {

      ArrayList<Object>  data =  new ArrayList<>() ;
      data.add(e:"Hello World);
      data.add(e:16);
      data.add(e:15.80);
      data.add(e:"A");
      data.add(e:true) ;
      for (int i = 0; i < data.size(); i++) {
        Object  element =  data.get(i) ;
        System.out.println(element) ;
}


 }
}

```



#### *I hope that was helpful*   


<img width="500" height="350" alt="Hope you enjoyed this part  See what's next!" src="https://github.com/user-attachments/assets/7a7b0c54-8f9d-46c4-ba85-c32a2d637195" />
