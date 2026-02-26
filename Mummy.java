public class Mummy extends Monster{

    private int bandages;

    public Mummy(){
        bandages = 10;
    }

    public Mummy(String name){
        super(name);
        bandages = 10;
    }

    public Mummy(String name, int bandages)
    {
        super(name);
        this.bandages=bandages;
    }

    //Override kill
    public String kill(){
        bandages--;
        return getName() + " wrapped a victim. Their tomb will be discovered in a hundred years. \n";
    }
    
    public String wrap(){
        bandages += (int)((Math.random() * 6)) + 1;
        return getName() + " wrapped themselves in a few more bandages. \n";
    }

    public int getBandageCount(){
        return bandages;
    }

    public String toString(){
        return super.toString() + "Bandages :: " + bandages + "\n";
    }
}