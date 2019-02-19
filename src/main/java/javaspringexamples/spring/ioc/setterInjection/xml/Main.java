package javaspringexamples.spring.ioc.setterInjection.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/javaspringexamples/spring/ioc/setterInjection/xml/xmlConfiguration.xml");

		// Getting and printing objectA
		A objectA = (A) applicationContext.getBean("objectA");
		System.out.println(objectA);

	}

}
