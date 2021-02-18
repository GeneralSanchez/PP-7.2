public class Sumo extends Sport
{
  private double weight;//variable that is used
  private boolean hashair;//variable that is used
  private String health;//variable that is used
  
  public Sumo (String name,int size,boolean isfaul,double points,double weight,boolean hashair,String health)//this is all the variables
  {
    super(name,size,isfaul,points);//gives acess to sport
    this.weight = weight;//weight to be used
    this.hashair = hashair;//hashair to be used
    this.health = health;//health to be used
  }
  //getters and setter for weight
  public double getWeight()
  {
    return weight;//to return this
  }
  public void setWeight(double weight)
  {
    this.weight = weight;//to set this 
  }
  //getters and setter for hashair
  public boolean getHair()
  {
    return hashair;//to return this
  }
  public void setHair(boolean hashair)
  {
    this.hashair = hashair;//to set this 
  }
  //getters and setter for health
  public String getHealth()
  {
    return health;//to return this
  }
  public void setHealth(String health)
  {
    this.health= health;//to set this 
  }

  public String sound()
  {
    return "ahhhhhhh!";//only sound for this one
  }
  public String slogan()
  {
    return "COME AT ME YOU!";//only in slogan here
  }

  public String toString()
  {
    String output = super.toString();//this is used to print the other things
    output += "\nPlayer Weight: "+weight+//for weight
              "\n Do you have hair?: " + hashair+//for hashair
              "\nHealth Score: "+health;//for health
    return output;//returns this output
  }
}