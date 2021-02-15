public abstract class Sport
{
  private String name;
  private int size;
  private boolean faul;
  private double points;

  public Sport (String name,int size,boolean faul,double points)
  {
    this.name = name;
    this,size = size;
    this.faul = faul;
    this,points = points;
  } 
  
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
}