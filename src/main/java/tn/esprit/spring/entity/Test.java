package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="T_Test")
public class Test implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Test_Id")
	private long id;
	
	@Column(name="Test_question")
	private String content;	
	
	@Column(name="Test_answer")
	private String answer;
	
	@JsonIgnore
	@ManyToOne()
	private Domain domainTest;

	//@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="test")
	private Set<Proposition>propositions;

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(long id, String content, String answer, Domain domainTest, Set<Proposition> propositions) {
		super();
		this.id = id;
		this.content = content;
		this.answer = answer;
		this.domainTest = domainTest;
		this.propositions = propositions;
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

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Domain getDomainTest() {
		return domainTest;
	}

	public void setDomainTest(Domain domainTest) {
		this.domainTest = domainTest;
	}

	public Set<Proposition> getPropositions() {
		return propositions;
	}

	public void setPropositions(Set<Proposition> propositions) {
		this.propositions = propositions;
	}

	
	}
