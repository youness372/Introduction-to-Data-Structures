public class Question2 {
     static void SortedArray  (int arr[] , int n   ) {
             int low = 0  ;     
             int mid = 0  ;     
             int  high =  n -  1 ;    
            while (mid <=  high)  {
                switch (arr[mid]) {
                    case 0 :
                        int temp =  arr[low]  ;
                        arr[low] =  arr[mid] ;
                        arr[mid] =  temp ;

                        low++;
                        mid++ ;
                        break;
                    case 1 :
                        mid++;
                        break;
                    case 2 :
                        temp  =  arr[mid]  ;
                        arr[mid] =  arr[high]  ;
                        arr[high] =  temp ;
                        high--;
                        break;
                }
            }
     }
    public static void main(String[] args) {
         int arr[] =  {0,1,2,0,0,1} ;
         int n =  arr.length ;
         SortedArray(arr,n);
         for (int i = 0 ; i < n ;   i++)  {

             System.out.println(arr[i]);
         }
    }
}
