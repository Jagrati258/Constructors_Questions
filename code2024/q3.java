class child{
  private String name;
  private float weight;
  
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return name;
  }

  public void setWeight(float weight)
  {
    this.weight=weight;
  }
  public float getWeight()
  {
    return weight;
  }

   public void show()
   {
     System.out.println(name + " " + weight);
   }
}

public class q3 {
  public static void main(String[] args) {
    child c= new child();
    c.setName("Rohit");
    c.setWeight(60.50f);
    c.show();
  }  
}
