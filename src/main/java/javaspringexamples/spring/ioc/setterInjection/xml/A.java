package javaspringexamples.spring.ioc.setterInjection.xml;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class A {
	private B b;
	private C c;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return b.toString() + " - " + c.toString();
	}
}
