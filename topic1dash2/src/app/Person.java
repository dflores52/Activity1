/**
 * 
 */
package app;

/**
 * @author flores
 *
 */
/**

Represents a Person with age, name and weight
*/
public class Person {
	
	private int age;
	private String name;
	private float weight;
	/**

	Creates a Person object with the given age, name and weight
	@param age the age of the person
	@param name the name of the person
	@param weight the weight of the person
	*/
	public Person (int age, String name, float weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		
	}
	//getter methods
	/**

	Returns the age of the person
	@return the age of the person
	*/
	public int getAge() {
		return age;
	}
	/**

	Returns the name of the person
	@return the name of the person
	*/
	public String getName() {
		return name;
	
	}
	/**

	Returns the weight of the person
	@return the weight of the person
	*/
	public float getWeight() {
		return weight;
	}
	
	//setter methods
	
	/**

	Sets the age of the person
	@param age the age of the person to set
	*/
	public void setAge(int age) {
		this.age = age;
	}
	/**

	Sets the name of the person
	@param name the name of the person to set
	*/
	public void setName(String name) {
		this.name = name;
		
	}
	/**

	Sets the weight of the person
	@param weight the weight of the person to set
	*/
	public void setWeight(float weight) {
		this.weight = weight;
		
	}
	/**

	Represents a method for walking.
	*/
	public void walk() {
		System.out.println("I am in walk()");
	}
	/**

	Represents a method for running a specific distance.
	@param distance the distance to run in float format
	*/
	public void run(float distance) {
		System.out.println("I am in run()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Luka = new Person(2, "Luka",(float) 29.3);
		
		System.out.println("My name is " + Luka.getName());
		Luka.walk();
		Luka.run(10);
		

}

}
