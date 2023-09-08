package dependencyinjectionconst;

public class Mobile {

	private int id;
	private String name;
	private Sim sim;
	public Mobile(int id, String name, Sim sim) {
		super();
		this.id = id;
		this.name = name;
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", sim=" + sim + "]";
	}
	
}
