
import java.awt.*;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        double area = 3.14 * (radius*radius);
        System.out.println("Area = "+area);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number1: ");
        int num1 = input.nextInt();
        System.out.println("Enter an number2: ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("Largest number is "+num1);
        }
        else if (num2>num1){
            System.out.println("Largest Number is "+num2);
        }
        else
            System.out.println("Numbers are equal");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int num = input.nextInt();
        int i=0;
        while (i<=num){
            System.out.println("Printing even numbers upto "+num);
            System.out.println(i);
            i = i+ 2;
        }

        public static void main(String[] args){
            Scanner input  = new Scanner(System.in);
            System.out.print("Enter an positive integer: ");
            long num = input.nextInt();
            long fact = 1;
            int i = (int)(num);
            if (num==0)
            {
                System.out.println(num+"! = "+fact);
                return;
            }
            while(i!=0)
            {
                fact = fact * i;
                i--;
            }
            System.out.println(num+"! = "+fact);
    
    
        }

        public static long fact(long n) {
            if (n <= 1)
               return 1;
            else
               return n * fact(n - 1);
         }
         public static void main(String args[]) {
            System.out.println("The factorial of 6 is: " + fact(6));
            System.out.println("The factorial of 0 is: " + fact(0));
         }


         public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an positive integer: ");
            double num = input.nextInt();
            int i = 1,j;
            while(i*i<=num){
                if(num%i==0){
                    j = (int)(num/i);
                    if(i==j)
                        System.out.print(j);
                    else
                        System.out.print(i+" "+j+" ");
                }
                i++;
            }
        }

        public static int fibonacciRecursion(int n){
            if(n == 0){
                return 0;
            }
            if(n == 1 || n == 2){
                    return 1;
                }
            return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
            }
            public static void main(String args[]) {
            int maxNumber = 10;
            System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
            for(int i = 0; i < maxNumber; i++){
                    System.out.print(fibonacciRecursion(i) +" ");
                }
            }

            public static void main(String[] args) {
                int perv_num =0,curr_num = 1,next_num,num;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter an number: ");
                num = input.nextInt();
                int i = 1;
                System.out.println(perv_num);
                System.out.println(curr_num);
                while(i<=num){
                    next_num = perv_num + curr_num;
                    System.out.println(next_num)w;
                    perv_num = curr_num;
                    curr_num = next_num;
                    i+=1;
                }
        
        
            }


            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter year: ");
                long year = input.nextInt();
                if(((year%4==0)&&(year%100!=0))||(year%400==0)){
                    System.out.println(year+" is a leap year");
                }
                else
                    System.out.println(year+" is not a leap year");
        
            }

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter an number1: ");
                int num1 = input.nextInt();
                System.out.println("Enter an number2: ");
                int num2 = input.nextInt();
                if (num1 > num2) {
                    System.out.println("Largest number is " + num1);
                } else {
                    System.out.println("Largest number is " + num2);
                }
            }

            public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  

   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer to check prime or not: ");
    int num = input.nextInt();
    int i = 2;
    if (num <= 1){
        System.out.println("Neither prime nor composite");
        return;
    }
    while( i * i <= num ){
        if( num % i == 0){
            System.out.println("Integer " + num + " is not Prime!");
            return;
        }
        i++;
    }
    if(i*i>num)
        System.out.println("Integer " + num + " is Prime!");


}

public static void main(String[] args) {
    for(int i = 1;i<=10;i++){
        for (int j = 0;j<=i;j++){
            System.out.print('*');
            System.out.print(' ');
        }
        System.out.println();
    }

}

}
