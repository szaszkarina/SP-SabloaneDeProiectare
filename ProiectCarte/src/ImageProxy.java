
public class ImageProxy implements Element {
	private String nume;
	private Imagine img;
	public ImageProxy(String nume) {
		this.nume=nume;
	}
	public void print() {
		if(img == null) {
			img = new Imagine(nume);
		}
			img.print();
		
	}
	
}
