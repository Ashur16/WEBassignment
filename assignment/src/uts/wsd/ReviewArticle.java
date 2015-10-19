package uts.wsd;

import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ReviewArticle implements Serializable{
	@XmlAttribute(name = "id")
	private int id;
	@XmlElement(name = "authorId")
	private int authorId;
	@XmlElement(name = "headline")
	private String headline;
	@XmlElement(name = "content")
	private String content;
	@XmlElement(name = "visible")
	private boolean visible;	


	// Constructor with data
	public ReviewArticle(int id, int authorId, String headline, String content, boolean visible) {
		super();
		this.id = id;
		this.authorId = authorId;
		this.headline = headline;		
		this.content = content;
		this.visible = visible;
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

	public String getTitle() {
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