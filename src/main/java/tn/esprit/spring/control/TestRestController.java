package tn.esprit.spring.control;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Proposition;
import tn.esprit.spring.entity.Test;
import tn.esprit.spring.service.TestService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api/v1")
public class TestRestController {

	@Autowired
	TestService testService;
	
	  @GetMapping("/TestbyDom/{idDom}")
	  @ResponseBody
	  public 	List<Test>   getAllDomain(@PathVariable("idDom")int idDom) {
		return testService.testByDom(idDom);
	  }
	  @GetMapping("/nbrtestByDom/{idDom}")
	  @ResponseBody
	  public int  nbrtestByDom(@PathVariable("idDom")int idDom) {
		return testService.nbrtestByDom(idDom);
	  }
	  
	  

}
