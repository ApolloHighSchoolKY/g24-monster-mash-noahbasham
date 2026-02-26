/**
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */
import java.util.ArrayList;

public class Farm {

    public static void main(String[] args) {
    	Cow moo = new Cow();
        System.out.println(moo);
        moo.eat();
        moo.eat();
        System.out.println(moo);

        Pig oinker = new Pig();
        System.out.println(oinker);
        //have the animals increase in age a little bit
        moo.eat();
        moo.eat();
        oinker.eat();
        oinker.eat();
        oinker.eat();
        oinker.eat();

        ArrayList<Animal> farm = new ArrayList<>();
        farm.add(moo);
        farm.add(oinker);

        for(Animal guy : farm)
        {
            if(guy.getAge()>3)
                guy.kill();
        }
        System.out.println(moo);
        System.out.println(oinker);
        Cow newCowOnTheBlock = new Cow();
        System.out.println(moo.equals(oinker));
        System.out.println(moo.equals(newCowOnTheBlock));
        System.out.println(moo.getSpecies());
        System.out.println(oinker.getSpecies());
    }


}