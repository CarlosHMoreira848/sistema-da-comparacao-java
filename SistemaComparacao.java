import java.util.Scanner;
public class SistemaComparacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor1, valor2;
		System.out.println("Bem vindo ao sistema de Comparação! Para começar digite o primeiro valor: ");
		valor1 = input.nextInt();
		System.out.println("Muito bem! Agora digite o segundo valor para comparar: ");
		valor2 = input.nextInt();
		if (valor1 > valor2) {
			System.out.println(valor1 + " é maior que " + valor2 + "!");
		} else if (valor1 == valor2) {
			System.out.println(valor1 + " é igual a " + valor2 + "!");
		} else {
			System.out.println(valor1 + " é menor que " + valor2 + "!");
		}
	}
}
