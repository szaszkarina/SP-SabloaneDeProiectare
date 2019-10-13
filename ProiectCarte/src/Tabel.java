
public class Tabel {
	private String nume;

	public Tabel() {
		
	}
	public Tabel(String nume) {
		this.nume = nume;
	}
	@Override
	public String toString() {
		return "Tabelul: " + nume;
	}
}
