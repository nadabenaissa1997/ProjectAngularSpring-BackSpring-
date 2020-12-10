package tn.esprit.spring.service;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.*;
import tn.esprit.spring.repository.*;

@Service
public class CommentServiceImpl implements CommentService{
	
   @Autowired   
   CommentRepository commentRepository;
   @Autowired
   DomainRepository domainRepository;
   
		@Override
		public int addCommentDom(Comment comment, int idDom) {
			Domain domain= domainRepository.findById((long) idDom).get();
			comment.setDomainComment(domain);
			commentRepository.save(comment);
			return 1;
		}
		
		@Override
		public int deleteCommentByDom(int idCom) {
			commentRepository.deleteById((long) idCom);
			return 0;
			
		}
		
		@Override
		public Comment updateCommentByDom(int idCom, Comment comment) {
			Comment com= commentRepository.findById((long) idCom).get();
			com.setContent(comment.getContent());
			commentRepository.save(com);
			return com;
		}
		
		@Override
		public List<Comment> allListcomment() {
			return (List<Comment>) commentRepository.findAll();
		}

		@Override
		public List<Comment> ListcommentByDom(int idDom) {
			List<Comment> commentDom= new ArrayList<Comment>();
			for(Comment com: (List<Comment>) commentRepository.findAll()){
				if(com.getDomainComment().getId()==idDom)
					commentDom.add(com);
			}
			return commentDom;
		}

		@Override
		public int addCommentDom(Comment comment) {
			commentRepository.save(comment);
			return 1;
		}
   

}
