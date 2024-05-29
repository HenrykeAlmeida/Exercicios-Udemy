package curso_programacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 24;
		salario = 5888.3;
		altura = 1.23;
		genero = 'F';
		nome = "Henrique Alves";
		
		System.out.println("Idade = " + idade);
		System.out.println("Salario = " + salario);
		System.out.println("Altura = " + altura);
		System.out.println("Genero = " + genero);
		System.out.println("Nome = " + nome);
		
		// para formatar um numero double* (numeros reais) é "System.out.println(String.format("%,2f", y"));
		// onde o "%.2f" é a quantidade de casas decimais depois da virgula
	}

}

		// Para funcionar a entrada de dados é preciso declarar depois
		// do "Locale.setDefault(Locale.US);" o "Scanner sc = new Scanner(System.in);"

		// Para Solicitar uma entrada de dados em JAVA 
		// System.out.print("Digite o nome da Primeira pessoa: );
		// nome1 = sc.nextLine();

		// System.out.print("Digite o Salario da Primeira pessoa: ");
		// salario1 = sc.nextDouble();
		// "idade = sc.nextInt();"
		// sexo = sc.next().charAt(0);
		// E assim por diante. 

