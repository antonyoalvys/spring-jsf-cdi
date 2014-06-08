package services.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.Hello;
import repositories.HelloRepository;
import services.HelloService;

@Service
@Transactional
public class HelloServiceImpl implements HelloService {

	@Inject
	private HelloRepository helloRepository;

	@Override
	public String hello() {
		return "Olá Spring e CDI";
	}

	@Override
	public void save(Hello entity) {
		helloRepository.save(entity);
	}

}
