
public class Paragraf implements Element  {
	private String nume;
	  private AlignStrategy al;

	  public AlignStrategy getAlignStrategy() {
	    return al;
	  }

	  public void setAlignStrategy(AlignStrategy alignStrategy) {
	    this.al = alignStrategy;
	  }
	public Paragraf()
	{
		
	}
	public Paragraf(String nume)
	{
		super();
		this.nume = nume;
	}
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	  @Override
	  public void print() {
	    if (al != null) {
	      al.print(nume);
	    } else {
	      System.out.println(nume);
	    }
	  }

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}
	public Element copy() {
		return new Paragraf(nume);
	}
	
}
