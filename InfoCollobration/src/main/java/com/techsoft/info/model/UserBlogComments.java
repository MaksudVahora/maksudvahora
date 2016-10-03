package com.techsoft.info.model;

import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserBlogComments {

	@Id
	@GeneratedValue
	@Column
	public String cmtID;
		
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "RefID")
	private UserBlog userblog;
	
	@Column
	public String DOC;
	
	@Column
	public String commentBy;
	
	@Column
	public String Comments;
	
	public UserBlogComments(){
		this.cmtID = "CMT" + UUID.randomUUID().toString().substring(24).toUpperCase();
	}
	
	public String getCmtID() {
		return cmtID;
	}

	public void setCmtID(String cmtID) {
		this.cmtID = cmtID;
	}

	public UserBlog getUserblog() {
		return userblog;
	}

	public void setUserblog(UserBlog userblog) {
		this.userblog = userblog;
	}

	public String getDOC() {
		return DOC;
	}

	public void setDOC(String dOC) {
		DOC = dOC;
	}

	public String getCommentBy() {
		return commentBy;
	}

	public void setCommentBy(String commentBy) {
		this.commentBy = commentBy;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}
}
