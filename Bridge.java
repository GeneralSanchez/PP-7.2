public class Bridge extends Sport
{
  private String role;
  private boolean trick;
  private int memory;

  public Lightsaber (String name,String side,int size,boolean isfaul,double points,String role,boolean trick,int memory)
  {
    super (name,size,isfaul,points);
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
  public String GetTrick()
  {
    return trick;
  }
  public void setTrick(boolean trick)
  {
    this.trick = trick;
  }
  //getter and setter for role
  public String GetMemory()
  {
    return memory;
  }
  public void setMemory(int memory)
  {
    this.memory = memory;
  }
  public String toString()
  {
    String output = super.toString();
    output += "\nYour role is: " + role +
              "\nTricks made: " + trick +
              "\nYo rememebered: " + memory;
    return output;
  }

}