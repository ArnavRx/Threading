package lti.forum.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="feeds")
public class Feed {
	@Id
	@Column(name="feed_id")
	private int feedId;
	private String question;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@Temporal(TemporalType.DATE)
	private Date feedStamp;
	@OneToMany(mappedBy="feed",cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	private Set<Comment> comments =new HashSet<Comment>();
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getFeedStamp() {
		return feedStamp;
	}
	public void setFeedStamp(Date feedStamp) {
		this.feedStamp = feedStamp;
	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
	

}
