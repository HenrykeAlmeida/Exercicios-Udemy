package curso_programacao;
import java.util.Scanner;

public class coordenadasWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois Numeros para o plano cartesiano(X, Y): ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0){
				System.out.println("Quadrante 1");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Quadrante 2");
			}
			else if (x < 0 && y < 0 ) {
				System.out.println("Quandrate 3");
			}
			else {
				System.out.println("Quadrante 4");
			}
			
			System.out.println("Digite dois Numeros para o plano cartesiano(X, Y): ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
