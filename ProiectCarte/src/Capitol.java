import java.util.ArrayList;

public class Capitol {
	private String nume;
	private ArrayList<Subcapitol> listaSubcapitole = new ArrayList<Subcapitol>();
	public Capitol() {
		
	}
	public Capitol(String nume)
	{
		this.nume = nume;

	}
	public int setSubcapitol(String nume)
	{
		Subcapitol subC = new Subcapitol(nume);
		this.listaSubcapitole.add(subC);
		return this.listaSubcapitole.indexOf(subC);
	}
	public Subcapitol getSubcapitol(int index)
	{
		return this.listaSubcapitole.get(index);
	}
	@Override
	public String toString() {
		return "Capitolul: " + nume + ", \n" + listaSubcapitole;
	}
	
}
