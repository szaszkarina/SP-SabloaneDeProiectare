
public class Memento {
private Element state;

public void setState(Element e) {
	this.state = e.copy();
}
public Element getState() {
	return state;
}
}
