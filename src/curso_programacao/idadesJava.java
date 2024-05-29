package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class idadesJava {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.println("Nome: ");
		nome1 = sc.nextLine(); //     sc.nextLine é para guardar Strings nas variaveis
		System.out.println("Idade: ");
		idade1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.println("Nome: ");
		sc.nextLine(); // Foi usado para limpar a sequencia de leitura de var...
		nome2 = sc.nextLine();
		System.out.println("Idade: ");
		idade2 = sc.nextInt();
		
		      //casting usado para alterar o tipo das variaveis na media  
		media = (double)(idade1 + idade2) / 2.0;
		System.out.println("A idade media de " + nome1 + "e " + nome2 + "eh de "
				+ String.format("%.1f", media) + " anos ");
				// formula para formatar as casas decimais da MEDIA
		
		sc.close();
	}

}
