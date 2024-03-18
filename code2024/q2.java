class InstanceCounter{
  
    private static int instanceCount=0;  

     public InstanceCounter()
  {
     instanceCount++;
  }

    public static int getInstanceCounter()
    {
      return instanceCount;
    }
}

public class q2 {
  public static void main(String[] args) {
    InstanceCounter ic1= new InstanceCounter();
    InstanceCounter ic2= new InstanceCounter();
    InstanceCounter ic3= new InstanceCounter();
 
    System.out.println("Number of instance created: " + InstanceCounter.getInstanceCounter());
  }   
}
