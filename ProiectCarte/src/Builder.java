import java.util.HashMap;

public interface Builder {
	Element getResult();
	void build();

	  Element buildImage(HashMap<String, Object> map);

	  Element buildParagraph(HashMap<String, Object> map);

	  Element buildTable(HashMap<String, Object> map);

	  Element buildImageProxy(HashMap<String, Object> map);

	  Element buildSection(HashMap<String, Object> map);
}
