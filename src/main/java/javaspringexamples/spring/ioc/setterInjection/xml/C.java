package javaspringexamples.spring.ioc.setterInjection.xml;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class C {
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
