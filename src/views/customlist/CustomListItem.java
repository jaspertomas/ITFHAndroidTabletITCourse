package views.customlist;

public class CustomListItem 
	//implements Comparable<CustomListItem>
{
	public static final Integer TITLE=0;
	public static final Integer TEXT=1;
	public static final Integer IMAGE=2;
	public static final Integer SLIDESHOW=3;
	public static final Integer TEXTBOX=4;
	public static final Integer SPACER=5;

	//use this for spacers
	public CustomListItem(Integer type) {
		super();
		this.type=type;
	}	
	//use this for slide shows
	//text means title
	//or for textboxes
	//slideshowprefix means dimensions
	public CustomListItem(Integer type, String text, String slideshowprefix) {
		super();
		this.type=type;
		this.text=text;
		this.parameter=slideshowprefix;
	}
	//use this for plain text 
	//the text is the content
	public CustomListItem(Integer type, String text) {
		super();
		this.type=type;
		this.text=text;
	}
	//use this for images
	//the text is the caption
	public CustomListItem(Integer type, Integer resource_id, String text) {
		super();
		this.type=type;
		this.text=text;
		this.resource_id=resource_id;
	}
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getResourceId() {
		return resource_id;
	}

	public void setResourceId(Integer resource_id) {
		this.resource_id = resource_id;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	private Integer type ;
	private String text ;
	private Integer resource_id ;
	private String parameter ;


	
}
