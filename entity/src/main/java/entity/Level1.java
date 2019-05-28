package entity;

public class Level1 extends Entity {
	
	private int id;
	private String map1;
	
	public Level1(int id, String map1) {
		this.setId(id);
		this.setMap1(map1);
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

	public String getMap1() {
		return map1;
	}

	public void setMap1(String map1) {
		this.map1 = map1;
	}
	
	
	
	
	

}
