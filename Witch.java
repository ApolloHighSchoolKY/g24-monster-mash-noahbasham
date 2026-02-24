public class Witch extends Monster{
    public Witch(String name){
        super(name);
    }

    //Override kill
    public String kill(){
        return getName() + " threw an ugly potion on a crowd. Hundreds are dead. \n";
    }

    public String fly(){
        return getName() + " went flying and cackling on her broomstick. \n";
    }
}
