
public class DeleteCommand implements Command {
	private Memento state = new Memento();
	public void execute() {
		
		Sectiune s= DocumentManager.getInstance().getSectiune();
		state.setState(s);
		DocumentManager.getInstance().addCommand(this);
		Element e=s.getElementS();
		if(e!=null)
		{
			s.remove(e);
		}
	}
	public void unexecute() {
		DocumentManager.getInstance().setSectiune((Sectiune)state.getState());
		
	}

}
