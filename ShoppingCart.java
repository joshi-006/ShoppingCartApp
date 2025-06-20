package Project;

import java.util.*;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Cart cart = new Cart(15);
		System.out.println("Enter your username:");
		String username = a.nextLine();
		User s = new User(username);

		while (true) {
			System.out.println("Select your choice:");
			System.out.println("1.Electronics");
			System.out.println("2.Accessories");
			System.out.println("3.Footwear");
			System.out.println("4.Books");
			System.out.println("5.Clothes");
			System.out.println("6.View Cart");
			System.out.println("7.Exit");
			System.out.println("Enter your choice:");
			int choice = a.nextInt();

			if (choice == 7) {
				System.out.println("Thank your for shopping");
				break;
			}

			if (choice == 6) {
				cart.displayCart();
				continue;
			}
			System.out.println("Enter the product:");
			String Name = a.nextLine();
			a.nextLine();
			double price = 0;
			try {
				System.out.print("Enter product price: ");
				price = a.nextDouble();
				if (price < 0) {
					throw new IllegalArgumentException("Price cannot be negative.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Enter a valid price.");
				a.nextLine();
			}

			Product product = null;

			switch (choice) {
			case 1:
				product = new Electronics(Name, price);
				break;
			case 2:
				product = new Accessories(Name, price);
				break;
			case 3:
				product = new Footwear(Name, price);
				break;
			case 4:
				product = new Books(Name, price);
				break;
			case 5:
				product = new Clothes(Name, price);
				break;
			default:
				System.out.println("Invalid choice");
				continue;

			}
			cart.addProduct(product);
		}

	}

}
