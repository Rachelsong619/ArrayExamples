import java.util.Scanner;
public class Factorial
{
   public static void main (String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.print(" Type in a small integer : ");

       int n = s.nextInt();
       int answer= factorial(n);
       System.out.println("Answer is "+answer);
   }
 
   public static int factorial( int n)
   {
       System.out.println(n);
 
       // Stopping condition. VERY important
       if (n<=1)
           return n;
 
       // factorial(n)=n*factorial(n-1)
       return n*factorial(n-1);
 
    }
   public static int count(int n)
    {
    }
 
 
 
   public static void main(String[] args)
    {
        /*
         * Count 
         * 1. Number of legs 10 elephant have
         * 2. Number of students in a school if each
         * class has 20 students and there are 12 rooms
         * 3. Number of fingers if there are 8 people
         * 4. Find the sum of odd numbers from 0 to N
         * 5. Find the sum of even numbers from 0 to N
        */ 
        int counted=0;
         // Task 1.
            counted = count(10);
            System.out.println(counted);
            if(n=10)
                return 4*count;
            System.out.println(count*4);
                    }
        // Task 2.
            
}
 
