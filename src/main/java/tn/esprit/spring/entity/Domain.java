package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="T_Domain")
public class Domain implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Dom_Id")
	private long id;
	
	@Column(name="Dom_Title")
	private String title;
	
	@Column(name="Dom_Description")
	private String description;
	
	@Column(name="Dom_Type")
	private String type;
	
	@Column(name="Dom_like")
	private int like;
	
	@Column(name="Dom_Image")
	private String image;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="domainComment")
	private Set<Comment>comments;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="domainTest")
	private Set<Test>tests;


public Domain() {
	super();
	// TODO Auto-generated constructor stub
}


public Domain(long id, String title, String description, String type, int like, String image, Set<Comment> comments,
		Set<Test> tests) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.type = type;
	this.like = like;
	this.image = image;
	this.comments = comments;
	this.tests = tests;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public int getLike() {
	return like;
}


public void setLike(int like) {
	this.like = like;
}


public String getImage() {
	return image;
}


public void setImage(String image) {
	this.image = image;
}


public Set<Comment> getComments() {
	return comments;
}


public void setComments(Set<Comment> comments) {
	this.comments = comments;
}


public Set<Test> getTests() {
	return tests;
}


public void setTests(Set<Test> tests) {
	this.tests = tests;
}



}