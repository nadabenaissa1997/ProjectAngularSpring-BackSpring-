package tn.esprit.spring.service;
import java.util.List;

import tn.esprit.spring.entity.*;
public interface DomainService {
	List<Domain>allListDomain();
	List<Domain> listDomainByType(String type);
	int updateDomainLike(int idDom);
	int addDomain(Domain domain);
	List<Domain> search(String search);

}
