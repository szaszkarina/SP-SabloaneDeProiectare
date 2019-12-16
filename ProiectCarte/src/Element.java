
public interface Element {

	public void print();
	public void accept(Visitor v);
	public Element copy();
	
}
