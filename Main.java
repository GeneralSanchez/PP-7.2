class Main
 {
  public static void main(String[] args) 
  {
    System.out.println("Andy Sanchez PP 7.2");
    //this is the information inside Bridge
    Bridge bridge = new Bridge("F4",4,false,15.9,"Cashier",true,17);
    //This is the information inside the Lightsaber
    Lightsaber Saber = new Lightsaber ("Republic",1,false,35.6,"High","Light",2,true);
    //this is the information that Sumo will take in to print out
    Sumo sumo = new Sumo ("Cheng",1,true,5.97,200.95,false,"unhealthy");

    System.out.println (bridge.toString());//this calls it to print it out
    System.out.println("The Bridge Slogan: "+bridge.slogan());//to get the slogan
    System.out.println("The Bridge Sound: " +bridge.sound());//to get the sound
    System.out.println("The Message of Bridge: "+bridge.message());//to get the message

    System.out.println("-----------------------");//to have space to read
    System.out.println (Saber.toString());//this calls it to print it out
    System.out.println("The Lightsaber Slogan: "+Saber.slogan());//to get slogan
    System.out.println("The Lightsaber Sound: "+Saber.sound());//to get sound
    System.out.println("The Message of Lightsaber: "+ Saber.message());//to get message

    System.out.println("-----------------------");//to have space to read
    System.out.println (sumo.toString());//this is used to print out
    System.out.println("The Sumo Slogan: "+sumo.slogan());//this is to get slogan
    System.out.println("The Sumo Sound: "+sumo.sound());//to get sound
    System.out.println("The Message of Sumo: "+sumo.message());//to get message
    System.out.println("-----------------------");//to have space to read
   
    
    
    
  }
}