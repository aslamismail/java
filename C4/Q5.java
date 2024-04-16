import java.util.*;
public class Q5 {
public static void main(String[] args){
System.out.println("Aslam Ismail\n23MCA022\n15-04-24");
LinkedList<String> L=new LinkedList<>();
L.add("Gold");
L.add("Silver");
L.add("Bronze");
L.add(0,"Olympics Medals");
System.out.println(L);
L.remove("Bronze");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);

}
}
