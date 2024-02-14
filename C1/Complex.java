public class Complex {
    
    int real, img;

    public Complex(int real, int img){
        this.img = img;
        this.real = real;
    }

    void display() {
        System.out.println(this.real + "+" + this.img + "i");
    }

    public static Complex add(Complex n1, Complex n2){
        Complex res = new Complex(0, 0);

        res.real = n1.real + n2.real;

        res.img = n1.img + n2.img;

        return res;
    }
    
    public static void main(String[] args) {


        System.out.println("Name: Aslam Ismail \nReg no : 23MCA022 \nDate : 14/02/2024");
        System.out.println("3, Add complex number.");

        Complex c1 = new Complex(4, 6);
        Complex c2 = new Complex(7, 2);

        System.out.println("First complex number  : ");
        c1.display();
        System.out.println("Second complex number  : ");
        c2.display();

        Complex res = add(c1, c2);
        System.out.println("Addition of complex number  : ");
        res.display();
    }
}
