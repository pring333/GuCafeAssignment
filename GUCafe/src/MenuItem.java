
public class MenuItem extends GUCafe {
	void buyCoffee(CoffeeMenu coffee) {
		System.out.println(coffee);
		money += coffee.price;
	}
	void buyTea(TeaMenu tea) {
		System.out.println(tea);
		money += tea.price;
	}

}
