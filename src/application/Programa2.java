package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");				  // Resolução do problema SEN CONSTRUTORES, Fazendo a instanciação antes e importando os dados lidos para a classe com o ponto
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		*/
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");				  // Resolução do problema COM CONSTRUTORES
		String name = sc.nextLine();                  // Resolvendo dessa forma, a instanciação é feita depois da leitura dos dados 
		System.out.println("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		product.setName("computer");
		
		
		System.out.println();						// toString serve para imprimir os atributos da Class Products
		System.out.println("Product Data: " + product.toString());
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();				// toString não é obrigatorio pois o proprio programa entende que é nessario fazer essa chamda da Class Product
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
