package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Comment;
import tn.esprit.spring.entity.Domain;

public interface CommentService {
	int addCommentDom(Comment comment,int idDom);
	int addCommentDom(Comment comment);
	int deleteCommentByDom(int id);
	Comment updateCommentByDom(int idCom, Comment comment);
	List<Comment> allListcomment();
	List<Comment> ListcommentByDom(int idDom);
}
