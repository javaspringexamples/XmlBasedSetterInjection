package javaspringexamples.spring.ioc.setterInjection.xml;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class B {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
