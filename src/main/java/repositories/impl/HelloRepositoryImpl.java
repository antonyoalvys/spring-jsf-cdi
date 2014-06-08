package repositories.impl;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.Hello;
import repositories.HelloRepository;

@Repository
@Transactional(readOnly = true)
public class HelloRepositoryImpl implements HelloRepository {

	@Inject
	private EntityManager em;

	@Override
	public void save(Hello entity) {
		em.persist(entity);
	}

}
