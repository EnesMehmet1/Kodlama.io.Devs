package Kodlama.io.Devs.entities.concrates;

public class langue {
	int id;
	String name;
	public langue() {
		super();
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
	public langue(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
