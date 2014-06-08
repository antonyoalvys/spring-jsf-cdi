package beans;

import java.io.Serializable;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import services.HelloService;
import entities.Hello;

@Component
@Scope("view")
public class HelloBean implements Serializable {

	private static final long serialVersionUID = -8274727103125851093L;

	private Hello entity;

	@Inject
	private HelloService helloService;

	public String getHello() {
		return helloService.hello();
	}

	public void save() {
		entity = new Hello();
		entity.setName("Hello Brazil");
		helloService.save(entity);
	}

}
