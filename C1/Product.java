public class Product{
int pcode;
String pname;
double price;
public Product(int pcode,String pname,double price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
public void display(){
System.out.println("Product Code: "+ pcode);
System.out.println("Product Name: "+ pname);
System.out.println("Price: $"+ price);
System.out.println();
}
public static void main(String[] args){
System.out.println("Name:Aslam Ismail \n Roll No:22 \n Date:06/02/24");
System.out.println("Define a class ‘product’ with data members pcode, pname and price. Create 3 objects ofthe class and find the product having the lowest price");
Product product1=new Product(1,"Laptop",1200.99);
Product product2=new Product(2,"Smartphone",699.89);
Product product3=new Product(3,"Tablet",399.67);
System.out.println("Details of Product 1 : ");
product1.display();
System.out.println("Details of Product 2 : ");
product2.display();
System.out.println("Details of Product 3 : ");
product3.display();
if(product1.price < product2.price && product1.price < product3.price){
System.out.println("Lowest price have: " + product1.pname);
}else if(product2.price < product3.price && product2.price < product1.price){
System.out.println("Lowest price have: " + product2.pname);
}else{
System.out.println("Lowest price have: " + product3.pname);
}
}
}
