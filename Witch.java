public class Witch extends Monster{
    public Witch(String name){
        super(name);
    }

//override the kill() method we inherited from monster
// must have the same name, same return type, same parameter(s)
public String kill(){
    System.out.println(super.kill());
    return "The victim got his J's stolen by a witch lmao";

}

public String toString(){
    return "AAAHHHHH IM MEELLTIINNGGG OOOOOWWWUUUUCCHHHH";
}

}
//HW  make a new monster type that extends monster type ( new file), oveeride kill and make something new