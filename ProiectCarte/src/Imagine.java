
public class Imagine extends Element {
	private String nume;
	public Imagine() {
		
	}
	public Imagine(String nume)
	{
		this.nume = nume;
	}
	@Override
	public String toString() {
		return  "Imaginea: " + nume;
	}
}
