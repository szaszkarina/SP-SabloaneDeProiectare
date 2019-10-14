
public class Paragraf extends Element  {
	private String nume;
	public Paragraf()
	{
		
	}
	public Paragraf(String nume)
	{
		this.nume = nume;
	}
	@Override
	public String toString() {
		return "Paragraful: " + nume ;
	}
	
}
