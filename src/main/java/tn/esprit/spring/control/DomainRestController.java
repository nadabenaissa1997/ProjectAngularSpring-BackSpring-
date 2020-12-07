package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.service.DomainService;
import tn.esprit.spring.entity.*;;
@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api/v1")
public class DomainRestController {

	@Autowired
	DomainService domainService;
	
	  @PutMapping("/updateDom/{idDom}")
	  @ResponseBody
	  public int modifyDomain(@PathVariable("idDom")int idDom, @RequestBody Domain domain) {
	  return domainService.updateDomainLike(idDom);
	  }
	  
	  @GetMapping("/ListDomain")
	  @ResponseBody
	  public List<Domain> getAllDomain() {
		return domainService.allListDomain();
	  }
	  
	  @GetMapping("/ListDomain/{type}")
	  @ResponseBody
	  public List<Domain> getAllDomainbyType(@PathVariable("type")String type) {
		return domainService.listDomainByType(type);
	  }
	  
		@PostMapping("/addDomain")
		@ResponseBody
		public int addDomain(@RequestBody Domain domain) {
			return domainService.addDomain(domain);
		}
	
}
