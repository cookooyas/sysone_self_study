package sprigFw.ex03.di01;

public class HelloController {
	// 의존성 생성
	IHelloService helloService = new HelloService();
	
	public void hello(String name) {
		System.out.println("HelloController : "+helloService.sayHello(name));
	}
}
