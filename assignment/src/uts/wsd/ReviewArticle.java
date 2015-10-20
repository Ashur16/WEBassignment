package uts.wsd;

import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ReviewArticle implements Serializable{
	@XmlAttribute
	private int id;
	@XmlElement
	private int authorId;
	private int hotelId;
	private String headline;
	private String content;
	private boolean visible;	

	
	// Constructor with data
	public ReviewArticle(int id, int authorId, int hotelId, String headline, String content, boolean visible) {
		super();
		this.id = id;
		this.authorId = authorId;
		this.hotelId = hotelId;
		this.headline = headline;		
		this.content = content;
		this.visible = visible;
	}
	

	// Constructor
		public ReviewArticle() {
			
		}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	public boolean getVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	// get short content for display
	public String getShortContent() {
		if(content.length() >= 60)
			return content.substring(0, 59) + "...";
		else
			return content;
	
	}
}