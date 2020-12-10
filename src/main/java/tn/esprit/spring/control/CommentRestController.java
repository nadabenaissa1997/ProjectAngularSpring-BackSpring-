package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Comment;
import tn.esprit.spring.service.CommentService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api/v1")

public class CommentRestController {
	
	@Autowired
	CommentService commentService;
	
	@GetMapping("/ListComment")
	@ResponseBody
	public List<Comment> getAllComment() {
	return commentService.allListcomment();
	 }
	
	@GetMapping("/ListComment/{idDom}")
	@ResponseBody
	public List<Comment> getCommentByDom(@PathVariable("idDom") int idDom) {
	return commentService.ListcommentByDom(idDom);
	 }

	@PostMapping("/addComment/{idDom}")
	@ResponseBody
	public int addComment(@RequestBody Comment comment,@PathVariable("idDom") int idDom ) {
		return commentService.addCommentDom(comment, idDom);
	}	
	
	@PostMapping("/addComment")
	@ResponseBody
	public int addCom(@RequestBody Comment comment) {
		return commentService.addCommentDom(comment);
	}
	
	@DeleteMapping("/deleteComment/{idcomment}")
	@ResponseBody
	public int deleteComment(@PathVariable("idcomment") int idCom){
		return commentService.deleteCommentByDom(idCom);
	}
	
	@PutMapping("/updateComment/{idcomment}")
	@ResponseBody
	public Comment updateComment(@RequestBody Comment comment, @PathVariable("idcomment") int idCom){
		return commentService.updateCommentByDom(idCom, comment);
	}
}
