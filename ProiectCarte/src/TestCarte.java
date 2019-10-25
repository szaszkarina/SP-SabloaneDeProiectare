
public class TestCarte {
	public static void main(String []args)
	{
		/*Carte myBook = new Carte("Emotiile");
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
		System.out.print(myBook);*/
		
		Carte noapteBuna = new Carte("Noapte buna, copii!");
		Autor rpGheo = new Autor("Radu Pavel Gheo");
		noapteBuna.setAutor(rpGheo);
		Sectiune cap1 = new Sectiune("Capitolul 1");
		Sectiune cap11 = new Sectiune("Capitolul 1.1");
		Sectiune cap111 = new Sectiune("Capitolul 1.1.1");
		Sectiune cap1111 = new Sectiune("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraf("Multumesc celor care au facut posibila......"));
		noapteBuna.addContent(cap1);
		cap1.addElement(new Paragraf("Moto capitol"));
		cap1.addElement(cap11);
		cap11.addElement(new Paragraf("Text from subchapter 1.1"));
		cap11.addElement(cap111);
		cap111.addElement(new Paragraf("Text from subchapter 1.1.1"));
		cap111.addElement(cap1111);
		cap1111.addElement(new Imagine("Image subchapter 1.1.1.1"));
		noapteBuna.print();
	}
}
