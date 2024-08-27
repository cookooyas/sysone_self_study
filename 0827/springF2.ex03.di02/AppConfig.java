package springFw.ex03.di03;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

@Configurable
@ComponentScan(basePackages= {"springFw.ex03.di03"})
public class AppConfig {
	// 중요한 빈이라 직접 호출하여 스캔방식외에 더 확실하게 가져올 때 쓰인다.
	@Bean
	IHelloService helloService() {
		return new HelloService();
	}
}
