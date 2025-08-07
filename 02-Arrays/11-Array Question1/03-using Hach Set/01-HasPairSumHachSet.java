public class ArrayQuestion1 {
    static  boolean  HaspairSum(int arr[] , int size ,  int Target)  {
        int min  =  Integer.MAX_VALUE ;
        int max  =  Integer.MIN_VALUE ;
        for (int i = 0 ;  i < size; i++  )  {
            if (arr[i]  > max )  {
                max  =  arr[i] ;
            }
            if (arr[i] < min) {
                min = arr[i]  ;
            }
        }
        boolean[]  visited =  new boolean[max - min +1 ] ;
        for (int i = 0 ; i < size ; i++)  {
            int complement = Target -  arr[i]  ;
            if ( complement  >=  min && complement <= max &&  visited[complement - min]) {
                return   true ;
            }
            visited[arr[i] - min ] =  true ;
        }
        return  false ;
    }
public static void main(String[] args) {
     int arr[] = {0,-1,2,-3,1} ;
     int size =  arr.length ;
     int Target = -2 ;
     if (HaspairSum(arr,size , targetSum);) {
      System.out.println("yes there is a pair of sum equal to :" + Target) ;   
    }
    else {
      System.out.println("there is not a pair of sum equal to : " + Target);
   } 
 }
}
