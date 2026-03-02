/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is the original object that we are going to
 * create. All other objects will inherit all of the
 * properties and abilities this object has. In some cases,
 * we will override the existing methods we will create
 * here.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016 
 */

//this is a change
public class Animal
{
	private int age;
	private boolean alive;
	private String sound;

	    /**
	     * Create a new animal with age zero (a new born).
	     */
	    public Animal()
	    {
			age = 0;
			alive = true;
			this("Sound");
	    }

		public Animal(String sound)
	    {
			age = 0;
			alive = true;
			this.sound = sound;
	    }

	    /**
	    * Check whether the animal is alive or not.
	    * @return True if the animal is still alive.
	    */
        public boolean isAlive()
    	{
			return(alive);
    	}

		public void eat(){
			age++;
		}
     	/**
     	* Make the animal die :(
     	*/
     	public void kill()
     	{
			alive = false;
     	}

		public int getAge(){
			return age;
		}

		public String getSpecies(){
			if(sound.equals("Moo!"))
				return "Cow";
			else if(sound.equals("Oink!"))
				return "Pig";
			else
				return "I have no clue what this thing is, it's definitely not a cow or a pig.";
		}
     	/**
     	* Have the animal make a noise
     	* @return the string that is the animals sound it makes
     	*/
     	public String speak()
     	{
     		return "" + sound;
     	}

     	/**
     	* If you attempt to print the animal, if the animal is alive print its age and have it make
     	* a sound.  If the animal is dead, have it print how old it was when it died.
     	* @return String to be printed to the console.
     	*/
     	public String toString()
     	{
     		if(alive)
				return "Age :: " + age + "\nSound :: " + sound + "\n";
			else
				return "Age of Death :: " + age + "\nSound :: " + sound + "\n";
     	}

		public String equals(Animal animal){
			String output = "";

			if(getAge()==animal.getAge())
				output += "The two animals are the same age.\n";
			else
				output += "The two animals are not the same age.\n";

			if(getSpecies().equals(animal.getSpecies()))
				output += "The two animals are the same species.\n";
			else
				output += "The two animals are not the same species.\n";

			return output;

			
		}
}