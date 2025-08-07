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
