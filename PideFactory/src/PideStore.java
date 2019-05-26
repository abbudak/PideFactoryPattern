
public class PideStore {
	public static void main(String[] args) {

		Pide pide = SimplePideFactory.orderPizza("cheese");
		System.out.println("\nPizza ready : " + pide.productName);
		
		Pide veggiePide = SimplePideFactory.orderPizza("veggie");
		System.out.println("\nPizza ready : " + veggiePide.productName);
	}
}
