package tn.esprit.spring.service;

import java.util.List;
import java.util.Set;

import tn.esprit.spring.entity.Proposition;
import tn.esprit.spring.entity.Test;

public interface TestService {
	List<Test> testByDom(int idDom);
	int nbrtestByDom(int idDom);
}
