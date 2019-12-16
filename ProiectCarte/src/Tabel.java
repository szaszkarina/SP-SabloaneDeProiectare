
public class Tabel implements Element {
	private String nume;

	public Tabel() {
		
	}
	public Tabel(String nume) {
		super();
		this.nume = nume;
	}
	@Override
	public void print() {
		System.out.println(nume);
	}
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	
		
	}
	public Element copy() {
		return new Tabel(nume);
	}
}
