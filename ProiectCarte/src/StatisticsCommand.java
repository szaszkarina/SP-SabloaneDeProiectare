
public class StatisticsCommand implements Command{
	
	public void execute() {
		BookStatisticss stats = new BookStatisticss();
	   Element e= DocumentManager.getInstance().getCarte().getElement(0);
	   e.accept(stats);
	    stats.printStatistics();

	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
}
