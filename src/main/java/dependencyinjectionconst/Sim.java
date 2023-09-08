package dependencyinjectionconst;

public class Sim {

	private int id;
	private String name;
	public Sim(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Sim [id=" + id + ", name=" + name + "]";
	}

	
}
