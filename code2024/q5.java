class Continue{
  private String name;
  private int age;
  
  static
  {
    System.out.println("Satic Block");
  }

  public Continue()
  {
    System.out.println("Defaukt constructor");
    name= "Jagrati";
    age= 21;
  }

  public Continue(String name)
  {
    System.out.println("One parameterised constructor");
    this.name=name;
    age= 23;
  }

  public Continue(String name, int age)
  {
    System.out.println("Two parameterised constructor");
    this.name=name;
    this.age=age;
  }

  public void display()
  {
    System.out.println(name + " " + age);
  }
}

public class q5 {
  public static void main(String[] args) {
    Continue con1= new Continue();
    con1.display();

    Continue con2= new Continue("Shivyanshi");
    con2.display();

    Continue con3= new Continue("Sanskriti", 22);
    con3.display();
  }  
}
