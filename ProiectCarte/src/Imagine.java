
public class Imagine implements Element {
	private String nume;
	public Imagine() {
		
	}
	public Imagine(String nume)
	{	
		super();
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	@Override
	public void print() {
		System.out.println(nume);
	}
}
