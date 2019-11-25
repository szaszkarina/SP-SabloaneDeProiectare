

public class DocumentManager {
  private static DocumentManager obj;
  private  Carte book ;

  private DocumentManager() {

  }

  public static DocumentManager getInstance() {
    if (obj == null) {
      obj = new DocumentManager();
    }
    return obj;
  }

  public void setCarte(Carte book) {
    this.book = book;
  }

  public  Carte getCarte() {
    return book;
  }
}

