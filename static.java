
public class Static {

    public static void main(String[] args) {
      Student s1 = new Student();
        s1.clg = "abc";
        System.out.println(s1.clg);
        Student s2 = new Student();   
        s2.clg = "xyz";
        System.out.println(s1.clg);
        System.out.println(s2.clg); 
        s1.display();
    }
}

    class Student {
       String clg;
    
       public  void display() {
          System.out.println(" inStudent class ::" + clg);
       }
    
    }