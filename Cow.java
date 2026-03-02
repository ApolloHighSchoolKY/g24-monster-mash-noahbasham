/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    private double milkProduced;

    public Cow()
    {
        super( "Moo!");
        milkProduced = 0;
    }

    public void eat(){
        super.eat();
        milkProduced += ((Math.random() * 10)) + 5;
    }
    
    public String toString(){
        return super.toString() + "Milk Produced :: " + milkProduced + "\n";
    }

}