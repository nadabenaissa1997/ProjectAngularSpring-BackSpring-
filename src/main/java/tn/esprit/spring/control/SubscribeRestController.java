package tn.esprit.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Subscribe;
import tn.esprit.spring.service.SubscribeService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api/v1")
public class SubscribeRestController {
	@Autowired
	SubscribeService subscribeService;
	
	@PostMapping("/addSubscribe/{idDom}")
	@ResponseBody
	public int addSubscribe(@RequestBody Subscribe subscribe,@PathVariable("idDom") int idDom ) {
		return subscribeService.addSubscribeDom(subscribe, idDom);
	}	
}
