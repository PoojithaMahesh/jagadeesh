package constructorinjection;

public class Laptop {

	private int id;
	private String name;
	private String generation;
     
	
	public Laptop(int id, String name, String generation) {
		super();
		this.id = id;
		this.name = name;
		this.generation = generation;
	}


	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", generation=" + generation + "]";
	}
	
	
}
