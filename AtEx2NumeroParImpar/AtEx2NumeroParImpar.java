import java.util.Scanner;

public class AtEx2NumeroParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, poi;
		
		System.out.print("Digite um numero");
		num = sc.nextInt();
		poi = (num%2);
		
		if (poi==0) {
			System.out.println("o número "+num+" é par");
		}else {
			System.out.println("O numero"+num+" é impar");
		}
		sc.close();
		

	}

}
