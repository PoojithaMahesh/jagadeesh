package dependencyinjection;

public class Mobile {
    private int id;
    private String name;
    private Sim sim;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", sim=" + sim + "]";
	}
    
}
