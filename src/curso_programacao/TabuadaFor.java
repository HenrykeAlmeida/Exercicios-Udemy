package curso_programacao;
import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite a tabuada desejada: ");
		N = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}
		
		sc.close();
	}

}
