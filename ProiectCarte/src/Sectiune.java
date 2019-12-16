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
	
	
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		for(Element e: listaElem) {
			e.accept(v);
		}
	}
	public void remove(Element e) {
		this.listaElem.remove(e);
	}
	
	public Element  getElementS() {
		return listaElem.get(listaElem.size() -1);
	}
	public Element copy() {
		Sectiune s =new Sectiune(sectionTitle);
		for(Element e:listaElem) {
			s.addElement(e.copy());
		}
		return s;
	}

}
