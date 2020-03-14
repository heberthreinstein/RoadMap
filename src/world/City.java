package world;

public class City {
	String name;
	int x;
	int y;

	public City(String name, int x, int y) {
		this.setName(name);
		this.setX(x);
		this.setY(y);
	}
	
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}