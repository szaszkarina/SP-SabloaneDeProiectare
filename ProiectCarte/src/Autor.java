
public class Autor {
	private String nume;

	public Autor() {
		
	}
	public Autor(String nume)
	{
		this.nume = nume;
	}
	@Override
	public String toString() {
		return "Autori: " + nume ;
	}
}
