package com.techsoft.info.model;

import java.util.UUID;
import javax.persistence.*;

@Entity
public class UserBlog {

	@Id
	@GeneratedValue
	@Column
	private String ID;
	
	@Column
	private String blogDate;
	
	@Column
	private String blogUser;
	
	@Column
	private String blogTitle;

	@Column
	private String blogMessage;
	
	@Column
	private char blogApproved;

	@Column 
	private String publicFlag;
	
	public UserBlog() {
		this.ID = "BLG" + UUID.randomUUID().toString().substring(24).toUpperCase();
	}

	public UserBlog(String iD, String blogDate, String blogUser, String blogTitle, String blogMessage, 
			char blogApproved, String publicFlag) {
		super();
		ID = iD;
		this.blogDate = blogDate;
		this.blogUser = blogUser;
		this.blogTitle = blogTitle;
		this.blogMessage = blogMessage;
		this.blogApproved = blogApproved;
		this.publicFlag = publicFlag;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getBlogDate() {
		return blogDate;
	}

	public void setBlogDate(String blogDate) {
		this.blogDate = blogDate;
	}

	public String getBlogUser() {
		return blogUser;
	}

	public void setBlogUser(String blogUser) {
		this.blogUser = blogUser;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogMessage() {
		return blogMessage;
	}

	public void setBlogMessage(String blogMessage) {
		this.blogMessage = blogMessage;
	}

	public int getBlogApproved() {
		return blogApproved;
	}
	
	public void setBlogApproved(char blogApproved) {
		this.blogApproved = blogApproved;
	}
	
	public String getPublicFlag() {
		return publicFlag;
	}
	public void setPublicFlag(String publicFlag) {
		this.publicFlag = publicFlag;
	}
	
	@Override
    public String toString() {
		return "Blog [ID=" + ID + ", blogTitle=" + blogTitle + ", blogMessage=" + blogMessage + ", blogUser=" + 
				blogUser + ", blogDate=" + blogDate + ", blogApproved=" + blogApproved + ", publicFlag=" + 
				publicFlag + "]";
	}
}
