public class Constructor {

    int a;
    char b;
    String c;
    int d;
    private Constructor() {
           a=10;
           b='A';
           c="default constructor";
    }
    public Constructor(int a,char b,String c) {
        this.a=a;
        this.b=b;
        this.c=c;       

    }
    public Constructor(Constructor c) {
        this.a=c.a;
        this.b=c.b;
        this.c=c.c;      
       this.d=1;
    }
    void display() {
        System.out.println("a::"+a);
        System.out.println("b::"+b);
        System.out.println("c::"+c);
           if (d==1) {
            System.out.println("c is instance of Constructor class");
        } 
    }
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(7,'P',"parameterized constructor");   
        Constructor c3 = new Constructor(c2);   
        c1.display();
        c2.display();
        c3.display();

//compile time error  because private constructor cannot be accessed outside the class
       /*student s1 = new student(); */

    }
}
// this is a private constructor class which cannot be accessed outside the class.
class student {
    int a;
    char b;
    String c;
    
    private student() {
           a=10;
           b='A';
           c="default constructor";
    } 
public void display() {
        System.out.println("a::"+a);
        System.out.println("b::"+b);
        System.out.println("c::"+c);
    }
    public static void main(String[] args) {
        student s1 = new student(); //compile time error  because private constructor cannot be accessed outside the class
        s1.display();
    }
}