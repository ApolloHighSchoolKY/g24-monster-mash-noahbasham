public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster(); NOT ALLOWED
    //There has to be a parameter because we gave it ONLY a modified constructor

    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());

    Monster sally = new Witch("Sally");

    System.out.println(sally);

    System.out.println(sally.kill());

    System.out.println(((Witch)sally).fly());

    //Declare a monster of your new Type (shown above)
    //Declare your new Type of Monster
    //Bonus challenge: Add an instance field
    Monster kingTut = new Mummy("King Tut");

    System.out.println(kingTut);

    Mummy cleopatra = new Mummy("Cleopatra");

    System.out.println(cleopatra);
    System.out.println(cleopatra.getBandageCount());
    System.out.println(cleopatra.kill());
    System.out.println(cleopatra.getBandageCount());
    System.out.println(cleopatra.wrap());
    System.out.println(cleopatra.getBandageCount());

  }
}
