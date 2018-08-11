package lti.forum.pojo;

import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="comments")
public class Comment {

	
	@Id
	@Column(name="comment_id")
	private int commentId;
	private String comments;
	@Temporal(TemporalType.DATE)
	private Date commentStamp;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name="feed_id")
	private Feed feed;
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCommentStamp() {
		return commentStamp;
	}
	public void setCommentStamp(Date commentStamp) {
		this.commentStamp = commentStamp;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Feed getFeed() {
		return feed;
	}
	public void setFeed(Feed feed) {
		this.feed = feed;
	}
	
	
	
	
	
}
