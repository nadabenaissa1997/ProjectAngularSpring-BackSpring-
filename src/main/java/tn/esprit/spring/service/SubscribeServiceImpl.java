package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Domain;
import tn.esprit.spring.entity.Subscribe;
import tn.esprit.spring.repository.DomainRepository;
import tn.esprit.spring.repository.SubscribeRepository;

@Service
public class SubscribeServiceImpl implements SubscribeService{
	   @Autowired
	   DomainRepository domainRepository;
	   @Autowired
	   SubscribeRepository subscribeRepository;
	   
	@Override
	public int addSubscribeDom(Subscribe subscribe, int idDom) {
		Domain domain= domainRepository.findById((long) idDom).get();
		subscribe.setDomainSubscribe(domain);
		subscribeRepository.save(subscribe);
		return 1;
	}

}
