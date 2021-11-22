import java.math.BigInteger;
import java.util.Scanner;
public class Laab2 {
 public static void main(String[] args) {
// write your code here
Scanner scanner = new Scanner(System.in);
System.out.println("Введите число от 1 до 15: ");
int n = scanner.nextInt();
scanner.close();
if (n >= 15 || n < 1) {
System.out.println("Неверное значение!");
return;
}
BigInteger factorialWhile = BigInteger.valueOf(1);
while(n > 0){
BigInteger mult = BigInteger.valueOf(n--);
factorialWhile = factorialWhile.multiply(mult);
}
System.out.println("Факториал равен " + factorialWhile.toString());
}

}
