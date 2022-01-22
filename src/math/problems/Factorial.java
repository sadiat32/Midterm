package math.problems;
/*
 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
 * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
 *
 */
//5! = 5 * (4 * 3 * 2 * 1) = 120
public class Factorial {

    public static void main(String[] args){
            //Recursion
//    System.out.println(factorial(5));}
//    public static int factorial(int n) {
//        if(n == 1) {
//            System.out.println("factorial(" + n + ") = 1");
//            return 1;
//        } else {
//            System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ")");
//            return n * factorial(n - 1);}}
    //Iteration
    int number = 5;
    long x = 1;
    for(int i = 1; i <= number; i++)
    {
        x = x * i;
    }
    System.out.println("Factorial of "+number+" is: "+x);
}
}
