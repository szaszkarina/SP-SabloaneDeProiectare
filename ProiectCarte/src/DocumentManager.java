import java.util.Stack;

public class DocumentManager {
  private static DocumentManager obj;
  private  Carte book ;
  private Sectiune s;
  private Stack<Command> commandHistory = new Stack<Command>();
  private Stack<Command> commandHistory2 = new Stack<Command>();

  

  private DocumentManager() {}

  public static DocumentManager getInstance() {
    if (obj == null) {
      obj = new DocumentManager();
    }
    return obj;
  }

  public void setCarte(Carte book) {
    this.book = book;
  }
  public void setSectiune(Sectiune s) {
	    this.s = s;
	  }

  public  Sectiune getSectiune() {
	    return s;
	  }
  public  Carte getCarte() {
    return book;
  }
  public void addCommand(Command c) {
	  commandHistory.push(c);
	  commandHistory2.push(c);
	  
  }
  public Command  getLastCommand() {
	  Command c = commandHistory.peek();
	  commandHistory.pop();
	  return c;
  }
  
  public Command  getLastUndo() {
	  Command c = commandHistory2.peek();
	  commandHistory2.pop();
	  return c;
  }
  
}

