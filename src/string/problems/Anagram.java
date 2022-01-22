package string.problems;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1= sc.nextLine();
        System.out.print("Enter second string: ");
        String str2= sc.nextLine();

        if(str1.length() == str2.length()) {

            // convert strings to char array and sort
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same then it is anagram
            boolean name = Arrays.equals(charArray1, charArray2);
            if(name) {
                System.out.println(str1 + " and " + str2 + " are anagram.");}
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");}
        }

        }
    }

