
public class CheesePide extends Pide {

	public CheesePide() {
		productName = "Cheese Pide";
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
		System.out.println("Adding Cheese Pide !!");
	}

	@Override
	public void bake() {
		System.out.println("Bake Cheese Pide !!");
	}

	@Override
	public void cut() {
		System.out.println("Cut Cheese Pide !!");
	}

	@Override
	public void pack() {
		System.out.println("Pack Cheese Pide !!");
	}
}
