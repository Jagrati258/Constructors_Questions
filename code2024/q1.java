class Marks{
    private String name;
    private int marks; 
    
     public Marks()
    {
      System.out.println("Default constructor");
      name= "Ravi";
      marks= 50;
    }

      public Marks(String name)
     {
       System.out.println("One parameterised");
       this.name=name;
       marks= 60;
     }

       public Marks(String name, int marks)
      {
        System.out.println("Two parameterised");
        this.name=name;
        this.marks=marks;
      }

      public void display()
      {
        System.out.println(name);
        System.out.println(marks);
      }
}

public class q1 {
  public static void main(String[] args) {
    Marks m1= new Marks();
    m1.display();
   
    Marks m2= new Marks("Rahul");
    m2.display();
   
    Marks m3= new Marks("Rajesh", 80);
    m3.display();
   
  }  
}
