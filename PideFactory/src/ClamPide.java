
public class ClamPide extends Pide {

	public ClamPide() {
		productName = "Clam Pide";
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
		System.out.println("Adding Clam Pide !!");
	}

	@Override
	public void bake() {
		System.out.println("Bake Clam Pide !!");
	}

	@Override
	public void cut() {
		System.out.println("Cut Clam Pide !!");
	}

	@Override
	public void pack() {
		System.out.println("Pack Clam Pide !!");
	}
}
