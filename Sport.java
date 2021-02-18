public abstract class Sport
{
  private String name;//variable that is used
  private int size;//variable that is used
  private boolean isfaul;//variable that is used
  private double points;//variable that is used
//Constructor
  public Sport (String name,int size,boolean isfaul,double points)//this is all the variables
  {
    this.name = name;//name to be used
    this.size = size;//sizr to be used
    this.isfaul = isfaul;//isfaul to be used
    this.points = points;//points to be used 
  } 
  //getter and setter for name
  public String getName()
  {
    return name;//to return this
  }
  public void setName(String name)
  {
    this.name = name;//to set this 
  }
  //getters and setter for size
  public int getSize()
  {
    return size;//to return this
  }
  public void setSize(int size)
  {
    this.size = size;//to set this 
  }
//getters and setter for faul
  public boolean getFaul()
  {
    return isfaul;//to return this
  }
  public void setFaul(boolean isfaul)
  {
    this.isfaul = isfaul;//to set this 
  }
  //getters and setter for points
  public double getPoints()
  {
    return points;//to return this
  }
  public void setPoints(double points)
  {
    this.points = points;//to set this 
  }
  //brain methods
  public String message()//for message prints in classes not verriden
  {
    return name + " is an ok sport for fitness,well not for Andy lol";
  }
  public abstract String sound();//this is abstract method
  public abstract String slogan();//this is abstarct method
  
  public String toString()
  {
    return "Team Name: "+name+//for name 
            "\nTeam Size: "+ size+//for size
            "\nA Faul: "+isfaul+//for isfaul
            "\nHow many points: "+points;//for points
  }

}