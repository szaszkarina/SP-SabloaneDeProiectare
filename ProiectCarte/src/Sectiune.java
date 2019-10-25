import java.util.ArrayList;

public class Sectiune implements Element {
	
	private String sectionTitle;
	ArrayList <Element> listaElem = new ArrayList<Element>();
	public Sectiune( String nume)
	{
		this.sectionTitle = nume;
	}
	public int addElement(Element nume)
	{
		
		this.listaElem.add(nume);
		return this.listaElem.indexOf(nume);
	}
	public Element getElementente(int index)
	{
		return this.listaElem.get(index);
	}
	public void removeElem(int index)
	{
		this.listaElem.remove(index);
	}
	public void print()
	{
		System.out.println(sectionTitle);
		for(Element e:listaElem) {
			e.print();
		}
	}

}
