public class boogFromOpenSeason extends Monster{
    public boogFromOpenSeason(String name){
        super(name);
    }
    

    //public String castSpell(){
     //   int spellNum = (int)(Math.random()*4)

     public String kill(){
        System.out.println(super.kill());
        return "boog gotchu broski. sir weenie came and messed you up too";
    }
}