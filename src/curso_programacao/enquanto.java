package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class enquanto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois Numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();

		// estrutura ENQUANTO, para rodar enquanto alguma condição for Falsa ou verdadeira
		while (x != y) {
			if (x < y) {
				System.out.println("CRESCENTE!!!!!!");
			}
			else {
				System.out.println("DECRESCENTE!!!!!");
			}
			System.out.println("Digite outros dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("NUMEROS IGUAIS!");
		
		sc.close();
	}

}
