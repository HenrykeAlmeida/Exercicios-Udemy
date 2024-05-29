package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	
	//Construtores
	public Product(String name, double price, int quantity) {
		this.name = name;		//Estrutura do Construtor, atribuindo os atributos para os paraemtros recebidos no progama principal
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;		//Estrutura da sobrecarga, que seria disponibilizar outro construtor para operação, a diferença entra na qtda dos parametros
		this.price = price;	
	}
	
	//Encapsulamento
	public void setName(String name) {
		this.name = name;
	}
	
	// Metodos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
