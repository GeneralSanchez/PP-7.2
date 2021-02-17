public class Bridge extends Sport
{
  private String role;
  private boolean trick;
  private int memory;

  public Bridge (String name,int size,boolean isfaul,double points,String role,boolean trick,int memory)
  {
    super(name,size,isfaul,points);
    this.role = role;
    this.trick = trick;
    this.memory = memory;
  }
  //getter and setter for role
  public String GetRole()
  {
    return role;
  }
  public void setRole(String role)
  {
    this.role = role;
  }
  //getter and setter for trick
  public boolean GetTrick()
  {
    return trick;
  }
  public void setTrick(boolean trick)
  {
    this.trick = trick;
  }
  //getter and setter for role
  public int GetMemory()
  {
    return memory;
  }
  public void setMemory(int memory)
  {
    this.memory = memory;
  }
 
  public String sound()
  {
    return "Think Think Think";
  }
  public String slogan()
  {
    return "The card win!";
  }
  
  public String toString()
  {
    String output = super.toString();
    output += "\nYour role is: " + role +
              "\nTricks: " + trick +
              "\nYou rememebered: " + memory;
    return output;
  }

}