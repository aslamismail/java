import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {

        System.out.println("Name: Aslam Ismail \n Reg no : 23MCA022 \n Date : 14/02/2024");
        System.out.println("2, Read 2 matrices from the console and perform matrix addition.");

  Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter no of columns : ");
        int column = sc.nextInt();

        int arr1[][] = new int[row][column];
        int arr2[][] = new int[row][column];
        int arr3[][] = new int[row][column];
        System.out.println("Enter the 1st array elements : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the 2nd array elements : ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Array elements are : ");

        for (int[] is : arr3) {
            System.out.println(Arrays.toString(is));
        }


        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //             System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

       
    }
}
