public class MonsterMash{
  public static void main(String[] args){

    Monster freakySkibidiah = new Monster("freakySkibidiah");

    System.out.println(freakySkibidiah.kill());
    System.out.println(freakySkibidiah.getName());


    Monster west = new Witch("Wicked Witch of the West");
    System.out.println(west);
    System.out.println(west.kill());
    
  }
}
