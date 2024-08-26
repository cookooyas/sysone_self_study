package sprigFw.ex03.di01;

// 2번째 단계
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("HelloService.sayHello() method 실행");
		String message= "Hello~~"+name;
		return message;
	}

}
