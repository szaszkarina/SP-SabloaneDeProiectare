
public class TestCarte {
	public static void main(String []args)
	{
		Carte myBook = new Carte("Emotiile");
		Autor autor = new Autor("Osho");
		myBook.setAutor(autor);
		int indexCapitol = myBook.setCapitol("Ce sunt Emotiile");
		Capitol capitolUnu = myBook.getCapitol(indexCapitol);
		int indexSubcapitol = capitolUnu.setSubcapitol("Ce sunt Emotiile");
		Subcapitol capitolUnuUnu = capitolUnu.getSubcapitol(indexSubcapitol);
		int indexImagine = capitolUnuUnu.setImagine("Img I");
		int indexParagraf = capitolUnuUnu.setParagraf("Prgf I");
		int indexParagraf2 = capitolUnuUnu.setParagraf("Prgf II");
		int indexParagraf3 = capitolUnuUnu.setParagraf("Prgf III");
		
		int indexTabel = capitolUnuUnu.setTabel("Tabl I");
		int indexTabel2 = capitolUnuUnu.setTabel("Tabl II");
		System.out.print(myBook);
	}
}
