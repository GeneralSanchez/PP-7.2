public class Lightsaber extends Sport
{
  private String quality;
  private String side;
  private int sabersamount;
  private boolean hasignated;

  public Lightsaber (String name,String side,int size,boolean isfaul,double points,String quality,int sabersamount,boolean hasignated)
  {
    super (name,size,isfaul,points);
    this.quality = quality;
    this.side = side;
    this.sabersamount = sabersamount;
    this.hasignated = hasignated;
  }
  //getter and setter for quality
  public String Getquality()
  {
    return quality;
  }
  public void setquality(String quality)
  {
    this.quality = quality;
  }
  //getter and setter for quality
  public String GetSide()
  {
    return side;
  }
  public void setSide(String side)
  {
    this.side = side;
  }
  //getter and setter for sabersamount
  public int Getsabersamount()
  {
    return sabersamount;
  }
  public void setsabersamount(int sabersamount)
  {
    this.sabersamount = sabersamount;
  }
  //getter and setter for hasignated
  public boolean Gethasignated()
  {
    return hasignated;
  }
  public void sethasignated(boolean hasignated)
  {
    this.hasignated = hasignated;
  }
  //overriden method
  public String message()
  {
    return super.getName()+ "MAY THE FORCE BE WITH YOU! General Sanchez supports this fight and message";
  }
  public String sound()
  {
    return "bbvvvvvvvvvvvvvnnnnnn";
  }
  public String toString()
  {
    String output = super.toString();
    output += "\nQuality: "+ quality+
              "\n Side of the Force: "+ side+
              "\nAmount of Sabers using: "+sabersamount+
              "\nCan it ignite: " + hasignated;
    return output;
  }

}