import java.util.Scanner;
public class Employ {
 int eNo;
 String eName;
 double eSalary;
 
 public Employ() {}
 public Employ(int eNo, String eName, double eSalary) {
 this.eNo = eNo;
 this.eName = eName;
 this.eSalary = eSalary;
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 System.out.println("Aslam Ismail\n23MCA022\n15-3-24");
 System.out.println("\nEnter the Number of Employees: ");
 int num = scanner.nextInt();
 
 Employ[] employees = new Employ[num];
 
 for (int i = 0; i < num; i++) {
 System.out.println("\nEnter details for employee " + (i + 1));
 System.out.print("Employee number: ");
 int eNo = scanner.nextInt();
 System.out.print("Name: ");
 String eName = scanner.next();
 System.out.print("Salary: ");
 double eSalary = scanner.nextDouble();
 employees[i] = new Employ(eNo, eName, eSalary);
 }
 
 System.out.println("\nInformation of all employees:");
 for (Employ emp : employees) {
 emp.display();
 }
 
 System.out.println("\nEnter the Employee Number to get details of an employee:");
 int num2 = scanner.nextInt();
 
 for (Employ emp : employees) {
 if (emp.eNo == num2) {
 System.out.println("\nEmployee details:");
 emp.display();
 break;
 }
 }
 }
 void display() {
 System.out.println("Employee No: " + eNo);
 System.out.println("Name: " + eName);
 System.out.println("Salary Amount: " + eSalary + "\n");
 }
}
