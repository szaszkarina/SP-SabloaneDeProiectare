
public class RedoCommand implements Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		DocumentManager.getInstance().getLastUndo().execute();
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}