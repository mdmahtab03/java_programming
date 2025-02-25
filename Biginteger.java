import java.math.BigInteger;
import java.util.Scanner;

class Biginteger {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        BigInteger value1, value2, result;

        System.out.print("Enter first value: ");
        value1 = input.nextBigInteger();

        System.out.print("Enter second value: ");
        value2 = input.nextBigInteger();

        result = value1.add(value2);
        System.out.println("Addition is: " + result);

        result = value1.subtract(value2);
        System.out.println("Subtraction is: " + result);

        result = value1.multiply(value2);
        System.out.println("Multiplication is: " + result);

        result = value1.divide(value2);  
        System.out.println("Division is: " + result);

        result = value1.mod(value2);  
        System.out.println("Modulus is: " + result);
    }
}
