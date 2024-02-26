class CPU {
int price;
class Processor {
int no_of_cores;
String manufactures;
Processor(int no_of_cores, String manufactures){
this.no_of_cores = no_of_cores;
this.manufactures = manufactures;
}
void display(){
System.out.println(" Processor info ");
System.out.println("No of cores : " + this.no_of_cores);
System.out.println("Manufacture : " + this.manufactures);
}
}
static class RAM {
int memory;
String manufactures;
RAM(int memory, String manufactures){
this.memory = memory;
this.manufactures = manufactures;
}
void display() {
System.out.println(" RAM info ");
System.out.println("Memory : " + this.memory);
System.out.println("Manufacture : " + this.manufactures);
}
}
}
public class PrgmCPU {
public static void main(String[] args) {
System.out.println("Name: Aslam Ismail \nReg no : 23MCA022 \nDate : 14/02/2024");
System.out.println("5, Create CPU with attribute price. Create inner class Processor (no. of cores,manufacturer) and static nested class RAM (memory, manufacturer). Create an object of CPU andprint information of Processor and RAM.");
CPU cpu = new CPU();
CPU.Processor prs = cpu.new Processor(4, "AMD");
CPU.RAM ram = new CPU.RAM(2048, "Blaze");
System.out.println("Cpu Price : " + cpu.price);
prs.display();
ram.display();
}
}
