
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
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}
	public Element copy() {
		return new ImageProxy(nume);
	}
}
