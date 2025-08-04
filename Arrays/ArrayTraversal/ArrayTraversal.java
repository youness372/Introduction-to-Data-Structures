public class HelloWorld {

    public  static  void main (String[] args)  {
        int [] numbers =  new int[]  {10,25,15,80,58,255,3,8528,58} ;
        String[]  names =  {"Youness" , "Lina" , "Rita"} ;

        System.out.println("The Array numbers : ");
        for (int i = numbers.length - 1   ; i  >=  0  ; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println("The Array names : ");
        for (int i = 0  ; i < names.length ; i++) {
            System.out.println(names[i]);
        }
    }
}
