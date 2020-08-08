package assignment;

public class Trainee {

	private int id;
	private String name;
	
	
	public Trainee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Trainee() {
		this(00,"");
	}

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
	
	@Override
	public int hashCode() {
		return id;
	}
	
	
}
