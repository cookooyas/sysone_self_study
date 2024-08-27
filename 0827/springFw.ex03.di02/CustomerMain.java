package springFw.ex03.di02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springFw.ex03.di01.HelloController;

public class CustomerMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:config/di02/application-config.xml");
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer);
	}
}
