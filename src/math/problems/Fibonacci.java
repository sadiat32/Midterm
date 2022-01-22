package math.problems;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13,21,34
         */
        Scanner sc=new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.print("Enter the number: ");
        int n=sc.nextInt();   //Declare and Initialize the number
        System.out.println("Fibonnaci series upto "+n+": ");
        //Print the fibonacci series
        while (t1 <= n)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
