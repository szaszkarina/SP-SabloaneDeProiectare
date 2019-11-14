
public class FinancialBookStatistics extends BookStatisticss {
	private int pretImg=5;
	private int pretPrgf=7;
	private int pretTabel=10;
	

	public void printStatistics() {
		System.out.println("Book statistics & financial: ");
		System.out.println( "pretul imaginilor " + pretImg + " cost total img "+pretImg*getNumarImg());
		System.out.println("Pret paragraf "+pretPrgf + " cost toal prgf " + pretPrgf*getNumarPrgf());
		System.out.println("Pret tabel "+pretTabel+ " cost total tabele " + pretTabel*getNumarTabel());
		System.out.println("Costul total " + (pretImg*getNumarImg()+pretPrgf*getNumarPrgf()+pretTabel*getNumarTabel()));
		
		
	}

}
