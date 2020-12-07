package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Domain;

@Repository
public interface DomainRepository extends CrudRepository<Domain, Long> {

}
