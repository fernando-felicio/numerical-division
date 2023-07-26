package numerical_division;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Input do usuário com a quantidade de casos que serão analisados
		System.out.println("Quantos casos serão analisados?");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			//Input do usuário com o número que será dividido
			System.out.printf("Para o %dº caso, digite um número inteiro para o Dividendo:%n", i+1);
			int dividendo = sc.nextInt();
			
			//Input do usuário com o divisor
			System.out.printf("Para o %dº caso, digite um número inteiro para o Divisor%n", i+1);
			int divisor = sc.nextInt();
						
			//Criando as regras do negócio
			if (divisor == 0) {
				System.out.println("Divisão impossível");
			}else {
				//Declarando variavel do resultado
				double resultado = (double) dividendo / divisor;
				
				System.out.printf("%.1f%n", resultado);
			}
			
		
			
		}
		sc.close();

	}

}
