# *Array Insertion 🪨*   
---   

### *How Insert actually Works with Example*    


<img width="700" height="500" alt="image" src="https://github.com/user-attachments/assets/8a232ea0-d569-4f44-83ac-55ba24cd9ccb" />

### *Example using Coding with (java)*    
---

```java

public class ArrayInsert {
  public static void main(String[]  args) {

  int [] nums =  new int[] {10,16,17,20,18} ;
  int insert_index = 2 ;
  int insert_Value = 25 ;

  for (int i = nums.length - 1 ; i > insert_index ; i--) {
      nums[i] = nums[i-1]  ;   }
  nums[insert_index] =  insert_value ;
 for (int i = 0 ; i < nums.length ; i++) {
    System.out.println(nums[i]) ; }
}   

}   

```

### *Explaining The Code*   
---

<img width="700" height="500" alt="image" src="https://github.com/user-attachments/assets/6d4e7503-b7cc-45e4-9cff-bb1712417767" />   


###  *I hope That was Helpful*


<img width="500" height="350" alt="Hope you enjoyed this part  See what's next!" src="https://github.com/user-attachments/assets/630a7347-b8a0-43b5-a086-de4e33a3eba4" />
