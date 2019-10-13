import java.util.ArrayList;

public class Subcapitol {
	private String nume;
	private ArrayList<Paragraf> listaParagrafe = new ArrayList<Paragraf>();
	private ArrayList<Tabel> listaTabele = new ArrayList<Tabel>();
	private ArrayList<Imagine> listaImagini = new ArrayList<Imagine>();
	public Subcapitol () {
		
	}
	public Subcapitol (String nume)
	{
		this.nume = nume;
	}
	public int setTabel(String nume)
	{
		Tabel t = new Tabel(nume);
		this.listaTabele.add(t);
		return this.listaTabele.indexOf(t);
	}
	public int setImagine(String nume)
	{
		Imagine i = new Imagine(nume);
		this.listaImagini.add(i);
		return this.listaImagini.indexOf(i);
	}
	public int setParagraf(String nume)
	{
		Paragraf p = new Paragraf(nume);
		this.listaParagrafe.add(p);
		return this.listaParagrafe.indexOf(p);
	}
	@Override
	public String toString() {
		return "Subcapitolul: " + nume + ", \n " + listaParagrafe + ", \n " + listaTabele
				+ ", \n " + listaImagini;
	}
	
}

