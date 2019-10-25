
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
}
