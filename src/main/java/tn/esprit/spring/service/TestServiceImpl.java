package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Comment;
import tn.esprit.spring.entity.Proposition;
import tn.esprit.spring.entity.Test;
import tn.esprit.spring.repository.PropRepository;
import tn.esprit.spring.repository.TestRepository;
@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestRepository testRpository;
	
	@Autowired
	PropRepository propRepository;
	
	@Override
	public List<Test> testByDom(int idDom) {
		List<Test> testDom= new ArrayList<Test>();
		List<Test> Tp =new ArrayList<Test>();
		Set<Proposition> p = new HashSet<Proposition>();
		for(Test test: (List<Test>) testRpository.findAll()){
			if(test.getDomainTest().getId()==(long)idDom)
				test.getPropositions().forEach(e->{
					e.setTest(null);
					p.add(e);
				});
				Tp.add(test);
					
			}
		return Tp;
	}

	@Override
	public int nbrtestByDom(int idDom) {
		int nbrQuestion = 0;
		for(Test test: (List<Test>) testRpository.findAll()){
			if(test.getDomainTest().getId()==(long)idDom)
				nbrQuestion++;
			}
		return nbrQuestion;
	}
}
