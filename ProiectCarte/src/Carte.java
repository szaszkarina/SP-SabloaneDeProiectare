import java.util.ArrayList;
import java.util.List;

public class Carte {
	private String nume;
	private ArrayList<Autor> listaAutori= new ArrayList<Autor>();
	private ArrayList<Element> listaElemente = new ArrayList<Element>();

	public Carte(String nume)
	{
		this.nume = nume;
	}
	public Element getElement(int e)
	{
		return listaElemente.get(e);
	}
	public void setAutor(Autor autor)
	{
		if(autor != null) {
		this.listaAutori.add(autor);
		}	
	}
	
	public void addContent(Element elem) {
		this.listaElemente.add(elem);
	}
	public void print() {
		System.out.println(nume);
		System.out.println(listaAutori);
		for(Element e: listaElemente) {
			e.print();
		}
	}
	


}
