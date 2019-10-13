
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
		int indexTabel = capitolUnuUnu.setTabel("Tabl I");
		System.out.print(myBook);
	}
}
