package tn.esprit.spring.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="T_Comment")
public class Comment implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Com_Id")
	private long id;
	
	@Column(name="Com_content")
	private String content;
	
	@JsonIgnore
	@ManyToOne()
	private Domain domainComment;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(long id, String content, Domain domainComment) {
		super();
		this.id = id;
		this.content = content;
		this.domainComment = domainComment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Domain getDomainComment() {
		return domainComment;
	}

	public void setDomainComment(Domain domainComment) {
		this.domainComment = domainComment;
	}

		

}