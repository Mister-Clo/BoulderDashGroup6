package entity;

public class Level1 extends Entity {
	
	private int id;
	private String map;
	
	public Level1(int id, String map) {
		this.setId(id);
		this.setMap(map);
	}
	
	public Level1() {
		this(0, "");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}
	
	
	
	
	

}
