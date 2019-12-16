
public class UndoCommand implements Command {
	public void execute() {
		DocumentManager.getInstance().getLastCommand().unexecute();
	}
	public void unexecute() {
		
	}

}
