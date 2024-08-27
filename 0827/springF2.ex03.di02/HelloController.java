package springFw.ex03.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	// autowired annotation은 타입으로 파악(구별)한다.
	@Autowired
	IHelloService helloService;
//	@Autowired
//	IHelloService niceHelloService;
//	
//	@Autowired 
//	@Qualifier("niceHelloService")
//	IHelloService helloService;
	public void hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
//		System.out.println("NiceHelloController : " + niceHelloService.sayHello(name));
	}
}
