

		import java.io.IOException;

		import com.fasterxml.jackson.core.JsonParseException;
		import com.fasterxml.jackson.databind.JsonMappingException;

		
public class TestCarte {
	//public static void main(String []args)
	//{
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
		
//		Carte noapteBuna = new Carte("Noapte buna, copii!");
//		Autor rpGheo = new Autor("Radu Pavel Gheo");
//		noapteBuna.setAutor(rpGheo);
//		Sectiune cap1 = new Sectiune("Capitolul 1");
//		Sectiune cap11 = new Sectiune("Capitolul 1.1");
//		Sectiune cap111 = new Sectiune("Capitolul 1.1.1");
//		Sectiune cap1111 = new Sectiune("Subchapter 1.1.1.1");
//		noapteBuna.addContent(new Paragraf("Multumesc celor care au facut posibila......"));
//		noapteBuna.addContent(cap1);
//		cap1.addElement(new Paragraf("Moto capitol"));
//		cap1.addElement(cap11);
//		cap11.addElement(new Paragraf("Text from subchapter 1.1"));
//		cap11.addElement(cap111);
//		cap111.addElement(new Paragraf("Text from subchapter 1.1.1"));
//		cap111.addElement(cap1111);
//		cap1111.addElement(new Imagine("Image subchapter 1.1.1.1"));
//		noapteBuna.print();
		
//		long startTime = System.currentTimeMillis();
//		ImageProxy img1 = new ImageProxy("Pamela Anderson");
//		ImageProxy img2 = new ImageProxy("Kim Kardashian");
//		ImageProxy img3 = new ImageProxy("Kirby Griffin");
//		Sectiune playboyS1 = new Sectiune("Front Cover");
//		playboyS1.addElement(img1);
//		Sectiune playboyS2 = new Sectiune("Summer Girls");
//		playboyS2.addElement(img2);
//		playboyS2.addElement(img3);
//		Carte playboy = new Carte("Playboy");
//		
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//				startTime) + " milliseconds");
//		Sectiune cap1 = new Sectiune("Capitolul 1");
//		Paragraf p1 = new Paragraf("Paragraph 1");
//		cap1.addElement(p1);
//		Paragraf p2 = new Paragraf("Paragraph 2");
//		cap1.addElement(p2);
//		Paragraf p3 = new Paragraf("Paragraph 3");
//		cap1.addElement(p3);
//		Paragraf p4 = new Paragraf("Paragraph 4");
//		cap1.addElement(p4);
//		System.out.println("Printing without Alignment");
//		System.out.println();
//		cap1.print();
//		p1.setAlignStrategy(new AlignCenter());
//		p2.setAlignStrategy(new AlignRight());
//		p3.setAlignStrategy(new AlignLeft());
//		System.out.println();
//		System.out.println("Printing with Alignment");
//		System.out.println();
//		cap1.print();
		
	/*		Sectiune cap1 = new Sectiune("Capitolul 1");
			Paragraf p1 = new Paragraf("Paragraph 1");
			cap1.addElement(p1);
			Paragraf p2 = new Paragraf("Paragraph 2");
			cap1.addElement(p2);
			Paragraf p3 = new Paragraf("Paragraph 3");
			cap1.addElement(p3);
			Paragraf p4 = new Paragraf("Paragraph 4");
			cap1.addElement(p4);
			cap1.addElement(new ImageProxy("ImageOne"));
			cap1.addElement(new Imagine("ImageTwo"));
			cap1.addElement(new Paragraf("Some text"));
			cap1.addElement(new Tabel("Table 1"));
			BookStatisticss stats = new BookStatisticss();
			FinancialBookStatistics stats2 = new FinancialBookStatistics();
			cap1.accept(stats);
			cap1.accept(stats2);
			stats.printStatistics();
			stats2.printStatistics();
			
		
	}*/
	    

		

		
//		  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//		    JSONBuilder jsonBuilder = new JSONBuilder("/Users/szaszkarina/Downloads/book.json");
//		    jsonBuilder.build();
//
//		    Element myBook = jsonBuilder.getResult();
//		    myBook.print();
//		  }
//		  public static void main(String[] args) throws Exception {
//			  Command cmd1 = new OpenCommand("/Users/szaszkarina/Downloads/book.json");
//			  cmd1.execute();
//			  Command cmd2 = new StatisticsCommand();
//			  DocumentManager.getInstance().getCarte().print();
//			  cmd2.execute();
//			
//			  }
	public static void main(String[] args) throws Exception {
		Sectiune cap1 = new Sectiune("Capitolul 1");
		cap1.addElement(new Paragraf("Moto capitol"));
		cap1.addElement(new Paragraf("Another One"));
		cap1.addElement(new Paragraf("Another Two"));
		cap1.addElement(new Paragraf("Another Three"));
		DocumentManager.getInstance().setSectiune(cap1);
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getSectiune().print();

		new DeleteCommand().execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getSectiune().print();
		new DeleteCommand().execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getSectiune().print();

		Command undoCommand = new UndoCommand();
		undoCommand.execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getSectiune().print();
		undoCommand.execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getSectiune().print();
		Command redoCommand = new RedoCommand();
		redoCommand.execute();
		System.out.println("Book Content after first REDO: ");
		DocumentManager.getInstance().getSectiune().print();
		redoCommand.execute();
		System.out.println("Book Content after second REDO: ");
		DocumentManager.getInstance().getSectiune().print();
		
		}
}
