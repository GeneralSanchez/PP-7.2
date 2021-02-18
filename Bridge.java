public class Bridge extends Sport//Bridge that comes from Sport
{
  private String role;//variable for the role
  private boolean trick;//variable for the trick
  private int memory;//variable to get the memory
//Constructor
  public Bridge (String name,int size,boolean isfaul,double points,String role,boolean trick,int memory)//this is all the variables
  {
    super(name,size,isfaul,points);//this is to get variables for sport
    this.role = role;//role to be use
    this.trick = trick;//trick to be used
    this.memory = memory;//memory to be used
  }
  //getter and setter for role
  public String GetRole()
  {
    return role;//to return this
  }
  public void setRole(String role)
  {
    this.role = role;//to set this 
  }
  //getter and setter for trick
  public boolean GetTrick()
  {
    return trick;//to return this
  }
  public void setTrick(boolean trick)
  {
    this.trick = trick;//to set this 
  }
  //getter and setter for role
  public int GetMemory()
  {
    return memory;//to return this
  }
  public void setMemory(int memory)
  {
    this.memory = memory;//to set this 
  }
 
  public String sound()
  {
    return "Think Think Think";//returns this only for this
  }
  public String slogan()
  {
    return "The card win!";//returns this only for this
  }
  
  public String toString()
  {
    String output = super.toString();//this is used to print the other things
    output += "\nYour role is: " + role +//for role
              "\nTricks: " + trick +//for trick
              "\nYou rememebered: " + memory;//for memory
    return output;//returns this output
  }

}