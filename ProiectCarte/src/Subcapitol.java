import java.util.ArrayList;

public class Subcapitol {
	private String nume;

	
	private ArrayList<Element> listaElemente = new ArrayList<Element>();
	
	public Subcapitol () {
		
	}
	public Subcapitol (String nume)
	{
		this.nume = nume;
	}
	public int setTabel(String nume)
	{
		Tabel t = new Tabel(nume);
		this.listaElemente.add(t);
		return this.listaElemente.indexOf(t);
	}
	public int setImagine(String nume)
	{
		Imagine i = new Imagine(nume);
		this.listaElemente.add(i);
		return this.listaElemente.indexOf(i);
	}
	public int setParagraf(String nume)
	{
		Paragraf p = new Paragraf(nume);
		this.listaElemente.add(p);
		return this.listaElemente.indexOf(p);
	}
	@Override
	public String toString() {
		return nume + "\n" + listaElemente;
	}
	
}

