package ProductDetails;

public class Catalogue {
	private Product[] listofAllProducts;
	Category cat1 = new Category();
	Category cat2 = new Category();
	Category cat3 = new Category();

	public Product[] getListofAllProducts() {
		cat1.setCategoryName("Clothes");
		cat2.setCategoryName("Electronics");
		cat3.setCategoryName("Furniture");

		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("shorts");
		product1.setCost("100");
		product1.setCategory(cat1);

		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("shirts");
		product2.setCost("200");
		product2.setCategory(cat1);

		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("phone");
		product3.setCost("10,000");
		product3.setCategory(cat2);

		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("TV");
		product4.setCost("1,00,000");
		product4.setCategory(cat2);

		Product product5 = new Product();
		product5.setProductId("5");
		product5.setProductName("sofa");
		product5.setCost("20,000");
		product5.setCategory(cat3);

		Product product6 = new Product();
		product6.setProductId("6");
		product6.setProductName("Bed");
		product6.setCost("50,000");
		product6.setCategory(cat3);

		listofAllProducts = new Product[6];
		listofAllProducts[0] = product1;
		listofAllProducts[1] = product2;
		listofAllProducts[2] = product3;
		listofAllProducts[3] = product4;
		listofAllProducts[4] = product5;
		listofAllProducts[5] = product6;
		return listofAllProducts;
	}

	public Product[] getSellerProducts() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("TABLE");
		product1.setCost("1000 rs");

		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("FRIDGE");
		product2.setCost("2000 rs");

		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("LIQUOR");
		product3.setCost("4000 rs");

		listofAllProducts = new Product[3];
		listofAllProducts[0] = product1;
		listofAllProducts[1] = product2;
		listofAllProducts[2] = product3;
		return listofAllProducts;

	}

	public void setListofAllProducts(Product[] listofAllProducts) {
		this.listofAllProducts = listofAllProducts;
	}

	public void setSellerProducts(Product[] listofAllProducts) {
		this.listofAllProducts = listofAllProducts;
	}

}
