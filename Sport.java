public abstract class Sport
{
  private String name;
  private int size;
  private boolean isfaul;
  private double points;

  public Sport (String name,int size,boolean isfaul,double points)
  {
    this.name = name;
    this.size = size;
    this.isfaul = isfaul;
    this.points = points;
  } 
  //getter and setter for name
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  //getters and setter for size
  public int getSize()
  {
    return size;
  }
  public void setSize(int size)
  {
    this.size = size;
  }
//getters and setter for faul
  public boolean getFaul()
  {
    return isfaul;
  }
  public void setFaul(boolean isfaul)
  {
    this.isfaul = isfaul;
  }
  //getters and setter for points
  public double getPoints()
  {
    return points;
  }
  public void setPoints(double points)
  {
    this.points = points;
  }
  //brain methods
  public String message()
  {
    return name + "is an ok sport for fitness,well not for Andy lol";
  }
  public abstract String sound();
  
  public String toString()
  {
    return "Sport Name:"+name+
            "\nTeam Size: "+ size+
            "\nA Faul:"+isfaul+
            "\nHow many points"+points;
  }

}