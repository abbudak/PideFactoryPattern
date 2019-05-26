import java.util.ArrayList;

public abstract class Pide {

	String productName;
	String productDough;
	String productSauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public final void templatePidePrepare() {
		prepare();
		bake();
		cut();
		pack();
	}

	public abstract void prepare();

	public abstract void bake();

	public abstract void cut();

	public abstract void pack();
}
