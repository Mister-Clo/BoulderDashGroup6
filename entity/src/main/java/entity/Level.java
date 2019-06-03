package entity;

public class Level extends Entity {
	
	private int id;
	private String map;
	
	/**
	 * Instantiates Level
	 * @param id
	 * @param map
	 */
	public Level(int id, String map) {
		this.setId(id);
		this.setMap(map);
	}
	
	/**
	 * default instance
	 */
	public Level() {
		this(0, "");
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return map
	 */
	public String getMap() {
		return map;
	}

	/**
	 * sets map
	 * @param map
	 */
	public void setMap(String map) {
		this.map = map;
	}
	
	
	
	
	

}
