package beans;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import services.HelloService;

@Named
@ViewScoped
public class HelloBean {
	
	@Inject
	private HelloService helloService;

	public String getHello() {
		return helloService.hello();
	}

}
