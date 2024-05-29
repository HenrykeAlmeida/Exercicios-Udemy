package curso_programacao;
import java.util.Scanner;

public class whilejava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite a senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("SENHA INVALIDA!");		
			System.out.println("Digite a senha: ");
			senha = sc.nextInt();
		}
		System.out.println("ACESSO PERMITIDO / BEM VINDO");
		sc.close();
	}

}
