import java.math.BigInteger;
	import java.util.Scanner;
    public class Lab2 {
	 

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter a number from 1 to 15: ");
	int n = scanner.nextInt();
	scanner.close();
	if (n >= 15 || n < 1) {
	System.out.println("Invalid number!");
	return;
	}
	BigInteger factorialFor = BigInteger.valueOf(1);
	for(int i = 1; i <= n; i++){
	BigInteger mult = BigInteger.valueOf(i);
	factorialFor = factorialFor.multiply(mult);
	}
	System.out.println("The resulting factorial: " + factorialFor.toString());

	}
 
	}


