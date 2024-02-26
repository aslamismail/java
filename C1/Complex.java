import java.util.Scanner;
public class Complex {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println(" Aslam Ismail\n 23MCA022\n 13-Feb-2024");
System.out.println("Enter the real part of the first complex number:");
double real1 = scanner.nextDouble();
System.out.println("Enter the imaginary part of the first complex number:");
double imaginary1 = scanner.nextDouble();
System.out.println("Enter the real part of the second complex number:");
double real2 = scanner.nextDouble();
System.out.println("Enter the imaginary part of the second complex number:");
double imaginary2 = scanner.nextDouble();
double sumReal = real1 + real2;
double sumImaginary = imaginary1 + imaginary2;
System.out.println("Sum of the complex numbers: " + sumReal + " + " +
sumImaginary + "i");
scanner.close();
}
}
