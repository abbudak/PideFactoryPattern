
public class SimplePideFactory {
	public static Pide orderPizza(String type) {

		Pide pide = null;

		if ("cheese".equals(type)) {
			pide = new CheesePide();
		} else if ("veggie".equals(type)) {
			pide = new VeggiePide();
		} else if ("clam".equals(type)) {
			pide = new ClamPide();
		} else if ("pepperoni".equals(type)) {
			pide = new PepperoniPide();
		}

		pide.templatePidePrepare();
		return pide;
	}
}
