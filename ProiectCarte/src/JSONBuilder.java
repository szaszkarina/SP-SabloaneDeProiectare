import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONBuilder implements Builder{

	private Element document = null;
	  private String filename;

	  public JSONBuilder(String filename) {
	    this.filename = filename;
	  }
	@Override
	public Element getResult() {
		// TODO Auto-generated method stub
		return document;
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		try {
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, Object> map = mapper.readValue(new File(filename),
			HashMap.class);
			document = processMap(map); // definim noi functia procesMap(map)
			} catch (JsonParseException e) {
			e.printStackTrace();
			} catch (JsonMappingException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
}
		
	

	 public Element buildImageProxy(HashMap<String, Object> map) {
		    Element imageProxy = new ImageProxy((String) map.get("url"));
		    return imageProxy;
		  }

		  @Override
		  public Element buildImage(HashMap<String, Object> map) {
		    Element image = new Imagine((String) map.get("url"));
		    return image;
		  }

		  @Override
		  public Element buildTable(HashMap<String, Object> map) {
		    Element table = new Tabel((String) map.get("url"));
		    return table;
		  }

		  @Override
		  public Element buildParagraph(HashMap<String, Object> map) {
		    Element para = new Paragraf((String) map.get("text"));
		    return para;
		  }

		  @Override
		  public Element buildSection(HashMap<String, Object> map) {
		    Sectiune section = new Sectiune((String) map.get("title"));
		    Collection<HashMap<String, Object>> children = (Collection<HashMap<String, Object>>) map.get("children");
		    children.forEach(childMap -> {
		      Element e = processMap(childMap);
		      if (e != null)
		        try {
		          section.addElement(e);
		        } catch (Exception e1) {
		          // TODO Auto-generated catch block
		          e1.printStackTrace();
		        }
		    });

		    return section;
		  }

		  private Element processMap(HashMap<String, Object> map) {
		    String elementClass = (String) map.get("class");
		    Element readElement = null;

		    if ("Section".equals(elementClass)) {
		      readElement = buildSection(map);
		    } else if ("Paragraph".equals(elementClass)) {
		      readElement = buildParagraph(map);
		    } else if ("Image".equals(elementClass)) {
		      readElement = buildImage(map);
		    } else if ("ImageProxy".equals(elementClass)) {
		      readElement = buildImageProxy(map);
		    }

		    return readElement;
		  }

		}