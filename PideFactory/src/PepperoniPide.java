
public class PepperoniPide extends Pide {

	public PepperoniPide() {
		productName = "Pepperoni Pide";
		productDough = "Crust";
		productSauce = "Marinara sauce";
		toppings.add("Shredded mozzarella");
		toppings.add("Grated parmesan");
		toppings.add("Diced onion");
		toppings.add("Sliced mushrooms");
		toppings.add("Sliced red pepper");
		toppings.add("Sliced black olives");
	}

	@Override
	public void prepare() {
		System.out.println("Adding Pepperoni Pide !!");
	}

	@Override
	public void bake() {
		System.out.println("Bake Pepperoni Pide !!");
	}

	@Override
	public void cut() {
		System.out.println("Cut Pepperoni Pide !!");
	}

	@Override
	public void pack() {
		System.out.println("Pack Pepperoni Pide !!");
	}
}
