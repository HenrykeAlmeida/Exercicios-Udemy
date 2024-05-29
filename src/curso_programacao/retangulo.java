package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.println("Base do retangulo: ");
		base = sc.nextDouble();
		System.out.println("Altura do retangulo: ");
		altura = sc.nextDouble();
		
		System.out.println();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		// Metodo para potencia   Math.pow(base, 2.0)   Metodo para potencia
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.println("Area: " + String.format("%.4f", area));
		System.out.println("Perimetro: " + String.format("%.4f", perimetro));
		System.out.println("Diagonal: " + String.format("%.4f", diagonal));
		
		sc.close();
	}

}
