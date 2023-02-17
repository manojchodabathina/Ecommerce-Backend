package Users;

import ProductDetails.Product;

public class Admin {
	private Product[] ProductsListed;
	private String adminId;
	private String password;

	public Product[] getProductsListed() {
		return ProductsListed;
	}

	public void setProductsListed(Product[] productsListed) {
		ProductsListed = productsListed;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
