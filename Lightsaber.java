public class Lightsaber extends Sport
{
  private String quality;//variable that is used
  private String side;//variable that is used
  private int sabersamount;//variable that is used
  private boolean hasignated;//variable that is used
//Constructor
  public Lightsaber (String name,int size,boolean isfaul,double points,String quality,String side,int sabersamount,boolean hasignated)//this is all the variables
  {
    super (name,size,isfaul,points);//gives acess to sport
    this.quality = quality;//quality to be used
    this.side = side;//side to be used
    this.sabersamount = sabersamount;//sbaer to be used
    this.hasignated = hasignated;//ignited to be used
  }
  //getter and setter for quality
  public String Getquality()
  {
    return quality;//to return this
  }
  public void setquality(String quality)
  {
    this.quality = quality;//to set this 
  }
  //getter and setter for quality
  public String GetSide()
  {
    return side;//to return this
  }
  public void setSide(String side)
  {
    this.side = side;//to set this 
  }
  //getter and setter for sabersamount
  public int Getsabersamount()
  {
    return sabersamount;//to return this
  }
  public void setsabersamount(int sabersamount)
  {
    this.sabersamount = sabersamount;//to set this 
  }
  //getter and setter for hasignated
  public boolean Gethasignated()
  {
    return hasignated;//to return this
  }
  public void sethasignated(boolean hasignated)
  {
    this.hasignated = hasignated;//to set this 
  }

  //overriden method
  public String message()//message that is turned in 
  {
    return super.getName()+ "MAY THE FORCE BE WITH YOU! General Sanchez supports this fight and message";
  }
  public String sound()
  {
    return "bbvvvvvvvvvvvvvnnnnnn";//lighsbaer sound
  }
  public String slogan()//slogan that cn be used
  {
    return "MAY THE FORCE BE WITH YOU ALWAYS!";
  }
  
  public String toString()
  {
    String output = super.toString();//this is used to print the other things
    output += "\nQuality: "+ quality+
              "\n Side of the Force: "+ side+
              "\nAmount of Sabers using: "+sabersamount+
              "\nCan it ignite: " + hasignated;
    return output;//returns this output
  }

}