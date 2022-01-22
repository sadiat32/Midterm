package math.problems;
import java.util.*;
import java.io.*;
public class PrimeNumber {
	static boolean checkPrime(int n)
	{
		boolean isPrime = true;

		// run loop upto sqrt(n) times
		for (int i = 2; i <=Math.sqrt(n) ; i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}

		// return result
		if(isPrime){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int numberOfPrimes = 0;

		// declare a list to store all prime numbers in the given range
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		// run loop from 2 to 1 million
		for(int i=2; i<=1000000; i++)
		{
			// make a function call to check if the i is a prime number
			if(checkPrime(i)){

				// if yes then add this number to the Array List
				arrList.add(i);

				// increase counter by 1
				numberOfPrimes++;
			}
		}

		// display the number of prime numbers in the given range
		System.out.println(numberOfPrimes);

		// now, retrieve the prime number from the list and store them into a text file
		try
		{
			// create a text file
			FileWriter writer = new FileWriter("primeNumbers.txt");

			// iterate over array list
			for(int i=0; i<arrList.size(); i++)
			{
				// store primes to the file
				writer.write(arrList.get(i) + ", ");

				if((i+1) % 10 == 0){
					writer.write("\n");
				}
			}
			// close file
			writer.close();

			// inform user
			System.out.println("Data successfully wrote to the file!");

			// catch Exception
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}


		}}


