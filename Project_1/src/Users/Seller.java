package Users;

import Orders.Cart;
import ProductDetails.Product;

public class Seller {
	private Product[] ProductsListed;
	private String sellerId;
	private String password;
	private Cart cart;

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean verifyUser() {

		return true;
	}

	public Product[] getProductsListed() {
		return ProductsListed;
	}

	public void setProductsListed(Product[] productsListed) {
		ProductsListed = productsListed;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
