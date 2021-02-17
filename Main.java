class Main
 {
  public static void main(String[] args) 
  {
    Bridge bridge = new Bridge("F4",4,false,15.9,"Cashier",true,17);
    
    Lightsaber Saber = new Lightsaber ("Republic",1,false,35.6,"High","Light",2,true);

    Sumo sumo = new Sumo ("Cheng",1,true,5.97,200.95,false,"unhealthy");

    System.out.println (bridge.toString());
    System.out.println("The Bridge Slogan: "+bridge.slogan());
    System.out.println("The Bridge Sound: " +bridge.sound());
    System.out.println("The Message of Bridge: "+bridge.message());
    System.out.println("-----------------------");
    System.out.println (Saber.toString());
    System.out.println("The Lightsaber Slogan: "+Saber.slogan());
    System.out.println("The Lightsaber Sound: "+Saber.sound());
    System.out.println("The Message of Lightsaber: "+ Saber.message());
    System.out.println("-----------------------");
    System.out.println (sumo.toString());
    System.out.println("The Sumo Slogan: "+sumo.slogan());
    System.out.println("The Sumo Sound: "+sumo.sound());
    System.out.println("The Message of Sumo: "+sumo.message());
    System.out.println("-----------------------");
   
    
    
    
  }
}