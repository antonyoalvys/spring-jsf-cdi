import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import services.HelloService;
import services.impl.HelloServiceImpl;
import beans.HelloBean;

public class Teste {

	public static void main( String[] args ) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext( "app-context.xml" );

		HelloService helloService = ctx.getBean( HelloServiceImpl.class );
		System.out.println( helloService.hello() );
	}

}
