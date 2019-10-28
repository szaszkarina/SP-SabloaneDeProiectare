import java.util.concurrent.TimeUnit;

public class Imagine implements Element {
	private String nume;
	public Imagine() {
		
	}
	public Imagine(String nume)
	{	
		this.nume = nume;
		try {
			
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	@Override
	public void print() {
		System.out.println(nume);
	}
}
