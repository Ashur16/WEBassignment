package uts.wsd;

import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ReviewArticle implements Serializable{
	@XmlElement(name = "articleId")
	private String articleId;
	@XmlElement(name = "authorid")
	private String authorId;
	@XmlElement(name = "headline")
	private String headline;
	@XmlElement(name = "publish_date")
	private String publish_date;
	@XmlElement(name = "content")
	private String content;
	@XmlElement(name = "visible")
	private String visible;
	
	// Constructor
	public ReviewArticle() {
		super();
	}

	// Constructor with data
	public ReviewArticle(String articleId, String authorId, String headline,
			String publish_date, String content, String visible) {
		super();
		this.articleId = articleId;
		this.authorId = authorId;
		this.headline = headline;
		this.publish_date = publish_date;
		this.content = content;
		this.visible = visible;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getTitle() {
		return headline;
	}

	public void setTitle(String title) {
		this.headline = headline;
	}

	public String getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	// get short content for display
	public String getShortContent() {
		if(content.length() >= 60)
			return content.substring(0, 59) + "...";
		else
			return content;
	}
	
	// Check is this article displaying for friend
	public boolean isShowForFriend(boolean isFriend) {
		if(isFriend && visible.equals("friend"))
			return true;
		else
			return false;
	}
}