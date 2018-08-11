package lti.forum.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	@Id
	@Column(name="user_id")
	private String userId;
	private String password;
	private String email;
	@OneToMany(mappedBy="user",cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	private Set<Feed> feeds =new HashSet<Feed>();
	@OneToMany(mappedBy="user",cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	private Set<Comment> comments =new HashSet<Comment>();
	
	
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Feed> getFeeds() {
		return feeds;
	}
	public void setFeeds(Set<Feed> feeds) {
		this.feeds = feeds;
	}
	

}
