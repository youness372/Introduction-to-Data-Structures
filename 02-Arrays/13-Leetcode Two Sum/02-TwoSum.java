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
