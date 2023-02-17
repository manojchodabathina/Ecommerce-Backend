package Ecommerce;

import java.util.*;
import Orders.*;
import ProductDetails.*;
import Users.*;

public class Store {
	public static void main(String[] args) {
		System.out.println("Welcome to the ecommerce store!");
		System.out.println("Which user are you? 1. Customer 2. Seller 3. Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("What is your userId");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("What is your password");
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User verified");
				while (true) {
					System.out.println("Do you want to 1.view products 2. view cart 3. contact us");
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("choose category");

						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListofAllProducts();
						System.out.println("1.Clothes 2. Electronics 3. Furniture");
						int chooseCategory = sc.nextInt();
						String selected = "";
						if (chooseCategory == 1) {
							selected = "Clothes";
						} else if (chooseCategory == 2) {
							selected = "Electronics";
						} else if (chooseCategory == 3) {
							selected = "Furniture";
						}
						for (int i = 0; i < allProducts.length; i++) {
							if (allProducts[i].getCategory().getCategoryName() == selected) {
								System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
										+ " " + allProducts[i].getCost());
							}
						}
						System.out.println("Do you want to add any products to cart? Y/N");
						sc.nextLine();
						String addToCart = sc.nextLine();
						if (addToCart.equals("Y")) {
							System.out.println("Input the product Id of the product which you want to add to cart");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId)) {
									cartProducts[0] = allProducts[i];
								}
							}
							Cart cart = new Cart();
							cart.setCartId("1");
							cart.setListOfProducts(cartProducts);
							current.setCart(cart);
							System.out.println("The product is successfully added to cart");

						}
					} else if (choice == 2) {
						Product[] cartProducts = current.getCart().getListOfProducts();
						System.out.println(current.getCart().getCartId());
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getCost());
						}
						System.out.println("Do you want to checkout? Y/N");
						sc.nextLine();
						String checkout = sc.nextLine();
						if (checkout.equals("Y")) {
							if (current.getCart().checkOut()) {
								// create an order object and assign this user to the order with an order id
								Order order = new Order();
								System.out.println("1.Buy product 2. Remove from cart");
								int chooseOrder = sc.nextInt();
								String selected = " ";
								if (chooseOrder == 1) {
									selected = "Buy product";
								} else if (chooseOrder == 2) {
									selected = "Remove from cart";
								}
								order.setOrderId("1");

								System.out.println("Your order is placed successfully");
								System.out.println("Happy shopping");
							}
						}
					} else if (choice == 3) {
						System.out.println("To contact us, please email on store@ecommerce.com");
					} else if (choice == 4) {
						break;
					} else {
						System.out.println("Invalid choice");
					}
				}
			}

		} else if (choice == 2) {
			typeOfUser = "Seller";
			Seller current = new Seller();
			System.out.println("What is your sellerId");
			sc.nextLine();
			current.setSellerId(sc.nextLine());
			System.out.println("What is your password");
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User verified");
			}
			while (true) {
				System.out.println("Do you want to 1.view products 2. view cart 3. contact us");
				choice = sc.nextInt();
				if (choice == 1) {
					Catalogue catalogue = new Catalogue();
					Product[] allProducts = catalogue.getSellerProducts();
					for (int i = 0; i < allProducts.length; i++) {
						System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName() + " "
								+ allProducts[i].getCost());
					}
					System.out.println("Do you want to add any products to cart? Y/N");
					sc.nextLine();
					String addToCart = sc.nextLine();
					if (addToCart.equals("Y")) {
						System.out.println("Input the product Id of the product which you want to add to cart");
						String productId = sc.nextLine();
						Product[] cartProducts = new Product[1];
						for (int i = 0; i < allProducts.length; i++) {
							if (allProducts[i].getProductId().equals(productId)) {
								cartProducts[0] = allProducts[i];
							}
						}
						Cart cart = new Cart();
						cart.setCartId("1");
						cart.setListOfProducts(cartProducts);
						current.setCart(cart);
						System.out.println("The product is successfully added to cart");

					}
				} else if (choice == 2) {
					Product[] cartProducts = current.getCart().getListOfProducts();
					System.out.println(current.getCart().getCartId());
					for (int i = 0; i < cartProducts.length; i++) {
						System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductId() + " "
								+ cartProducts[i].getCost());
					}
					System.out.println("Do you want to checkout? Y/N");
					sc.nextLine();
					String checkout = sc.nextLine();
					if (checkout.equals("Y")) {
						if (current.getCart().checkOut()) {

							Order order = new Order();
							System.out.println("1.Buy product ?");
							String chooseOrder = sc.nextLine();
							String selected = " ";
							if (chooseOrder == "Y") {
								selected = "Buy product";
								System.out.println("Your order is placed successfully");
								System.out.println("Happy shopping");
							} else {
								selected = "Remove from cart";
								System.out.println("removed");
							}
							order.setOrderId("1");

						}
					}
				} else if (choice == 3) {
					System.out.println("To contact us, please email on store@ecommerce.com");
				} else if (choice == 4) {
					break;
				} else {
					System.out.println("Invalid choice");
				}
			}

		} else if (choice == 3) {
			typeOfUser = "Admin";
			Admin current = new Admin();
			System.out.println("What is your adminId");
			sc.nextLine();
			current.setAdminId(sc.nextLine());
			System.out.println("What is your password");
			current.setPassword(sc.nextLine());

			System.out.println("View all the products");
			Catalogue catalogue = new Catalogue();
			Product[] allProducts = catalogue.getListofAllProducts();

			for (int i = 0; i < allProducts.length; i++) {
				System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName() + " "
						+ allProducts[i].getCost());
			}
			Product[] allProducts1 = catalogue.getSellerProducts();
			for (int i = 0; i < allProducts1.length; i++) {
				System.out.println(allProducts1[i].getProductId() + " " + allProducts1[i].getProductName() + " "
						+ allProducts1[i].getCost());
			}
		} else {
			System.out.println("Invalid input, Try again");
		}
	}
}
