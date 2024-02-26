import java.util.Arrays;
import java.util.Scanner;
public class Symmetric {
public static void main(String[] args) {
System.out.println("Name: Aslam Ismail \nReg no : 23MCA022 \nDate : 14/02/2024");
System.out.println("4, Read a matrix from the console and check whether it is symmetric or not.");
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of rows : ");
int row = sc.nextInt();
System.out.println("Enter no of columns : ");
int column = sc.nextInt();
int arr[][] = new int[row][column];
System.out.println("Enter the array elements : ");
for(int i = 0; i < arr.length; i++){
for(int j = 0; j< arr.length; j++){
arr[i][j] = sc.nextInt();
}
}
if (row != column) {
System.out.println("It is not Square matrix!");
}else {
boolean flag = true;
for (int i = 0; i < arr.length; i++){
for (int j = 0; j < arr.length; j++) {
if (arr[i][j] != arr[j][i]) {
flag = false;
break;
}
}
}
if (flag) {
System.out.println("The matrix is Symmetric.");
}else {
System.out.println("Matrix is not Symmetric.");
}
}
System.out.println("Matrix : ");
for (int[] is : arr) {
System.out.println(Arrays.toString(is));
}
}
}
