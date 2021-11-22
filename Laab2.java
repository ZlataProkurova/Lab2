import java.math.BigInteger;
import java.util.Scanner;
public class Laab2 {
 public static void main(String[] args) {
// write your code here
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a number from 1 to 15: ");
int n = scanner.nextInt();
scanner.close();
if (n >= 15 || n < 1) {
System.out.println("Invalid number!");
return;
}
BigInteger factorialWhile = BigInteger.valueOf(1);
while(n > 0){
BigInteger mult = BigInteger.valueOf(n--);
factorialWhile = factorialWhile.multiply(mult);
}
System.out.println("The resulting factorial: " + factorialWhile.toString());
}

}
