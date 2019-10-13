import java.util.ArrayList;

public class Carte {
	private String nume;
	private ArrayList<Autor> listaAutori = new ArrayList<Autor>();
	private ArrayList<Capitol> listaCapitole = new ArrayList<Capitol>();

	public Carte(String nume)
	{
		this.nume = nume;
	}
	public void setAutor(Autor autor)
	{
		if(autor != null) {
		this.listaAutori.add(autor);
		}	
	}
	public int setCapitol(String nume)
	{
		Capitol c = new Capitol(nume);
		this.listaCapitole.add(c);
		return listaCapitole.indexOf(c);
	}
	public Capitol getCapitol(int index)
	{
		return this.listaCapitole.get(index);
	}
	@Override
	public String toString() {
		return "Cartea: " + nume + ",\n " + listaAutori + ", \n " + listaCapitole;
	}


}
