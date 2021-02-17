public class Sumo extends Sport
{
  private double weight;
  private boolean hashair;
  private String health;
  
  public Sumo (String name,int size,boolean isfaul,double points,double weight,boolean hashair,String health)
  {
    super(name,size,isfaul,points);
    this.weight = weight;
    this.hashair = hashair;
    this.health = health;
  }
  //getters and setter for weight
  public double getWeight()
  {
    return weight;
  }
  public void setWeight(double weight)
  {
    this.weight = weight;
  }
  //getters and setter for hashair
  public boolean getHair()
  {
    return hashair;
  }
  public void setHair(boolean hashair)
  {
    this.hashair = hashair;
  }
  //getters and setter for health
  public String getHealth()
  {
    return health;
  }
  public void setHealth(String health)
  {
    this.health= health;
  }

  public String sound()
  {
    return "ahhhhhhh!";
  }
  public String slogan()
  {
    return "COME AT ME YOU!";
  }

  public String toString()
  {
    String output = super.toString();
    output += "\nPlayer Weight: "+weight+
              "\n Do you have hair?: " + hashair+
              "\nHealth Score: "+health;
    return output;
  }
}