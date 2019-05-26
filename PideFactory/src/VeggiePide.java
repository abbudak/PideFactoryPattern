
public class VeggiePide extends Pide {

	public VeggiePide() {
		productName = "Veggie Pide";
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
		System.out.println("Adding Veggie Pide !!");
	}

	@Override
	public void bake() {
		System.out.println("Bake Veggie Pide !!");
	}

	@Override
	public void cut() {
		System.out.println("Cut Veggie Pide !!");
	}

	@Override
	public void pack() {
		System.out.println("Pack Veggie Pide !!");
	}
}
