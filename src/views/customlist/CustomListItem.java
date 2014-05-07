package views.customlist;

public class CustomListItem 
	//implements Comparable<CustomListItem>
{
	public static final Integer TEXT=1;
	public static final Integer IMAGE=2;
	public static final Integer SLIDESHOW=3;
	public static final Integer TEXTBOX=4;
	
	public CustomListItem(Integer type, String text) {
		super();

		this.type=type;
		if(type==TEXT)
			this.text=text;
	}
	public CustomListItem(Integer type, Integer resource_id) {
		super();

		this.type=type;
		if(type==IMAGE)
			this.resource_id=resource_id;
//		else if(type.contentEquals("slideshow"))
//			this.slideshowprefix=array[1];
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

	public String getSlideshowprefix() {
		return slideshowprefix;
	}

	public void setSlideshowprefix(String slideshowprefix) {
		this.slideshowprefix = slideshowprefix;
	}

	private Integer type ;
	private String text ;
	private Integer resource_id ;
	private String slideshowprefix ;


	
}
