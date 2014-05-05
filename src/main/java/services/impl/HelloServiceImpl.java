package services.impl;

import org.springframework.stereotype.Service;

import services.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello() {
		return "Olá Spring e CDI";
	}

}
