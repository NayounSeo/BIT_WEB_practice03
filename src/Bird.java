
public abstract class Bird {
	private String name;
	private int legs;
	private int length;
	
	public Bird(String name, int length) {
		this.name = name;
		this.legs = 2;
		this.length = length;
	}
	public abstract void  fly();
	public abstract void sing();
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Bird [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
	
}
