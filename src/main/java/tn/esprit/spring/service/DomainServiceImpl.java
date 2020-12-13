package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Comment;
import tn.esprit.spring.entity.Domain;
import tn.esprit.spring.repository.DomainRepository;

@Service
public class DomainServiceImpl implements DomainService{
	
@Autowired
DomainRepository domainRepository;

	@Override
	public List<Domain> allListDomain() {
		return (List<Domain>)domainRepository.findAll();
	}

	@Override
	public int addDomain(Domain domain) {
		domainRepository.save(domain);
		return 1;
	}


	@Override
	public List<Domain> listDomainByType(String type) {
			List<Domain> domainType= new ArrayList<>();
			for(Domain dom: (List<Domain>)domainRepository.findAll()){
				if(dom.getType().toUpperCase().equals(type.toUpperCase()))
					domainType.add(dom);
			}
		return domainType;
	}

	@Override
	public int updateDomainLike(int idDom) {
		Domain dom= domainRepository.findById((long) idDom).get();
		dom.setLike(dom.getLike()+1);
		domainRepository.save(dom);
		return 1;
	}

	@Override
	public List<Domain> search(String search) {
		List<Domain> domainSearch= new ArrayList<>();
		for(Domain dom: (List<Domain>)domainRepository.findAll()){
			if  (dom.getType().toUpperCase().contains(search.toUpperCase())
					|| (dom.getTitle().toUpperCase().contains(search.toUpperCase())) 
					|| (dom.getDescription().toUpperCase().contains(search.toUpperCase()))
					|| (dom.getType().toUpperCase().contains(search.toUpperCase()))) 
				domainSearch.add(dom);
		}
		return domainSearch;
			
	}

}
