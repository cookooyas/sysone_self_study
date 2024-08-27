package springFw.ex03.di03;

import org.springframework.stereotype.Service;

@Service
public class NiceHelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("NiceHelloService.sayHello() 메서드 실행");
		String message = "Hello~~~~~" + name;
		
		return message;
	}
}
