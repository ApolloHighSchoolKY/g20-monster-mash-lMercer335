public class Monster
{
  private String myName;


  public Monster( String name ) {
      myName = name;
  }

  public String getName(){
    return myName;
  }

  public String kill(){
    return myName + " made some leg hair salami.  mmmmmmm slammy. \n";
  }

  public String toString() {
     return "Monster name :: " + myName + "\n";
  }
}