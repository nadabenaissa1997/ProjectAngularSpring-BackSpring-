package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Proposition;

public interface PropRepository extends CrudRepository<Proposition, Long>{

}
