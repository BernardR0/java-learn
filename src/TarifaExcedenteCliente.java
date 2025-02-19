import java.util.Scanner;

public class TarifaExcedenteCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas_cliente;
		double mensalidade, mensalidade_excedente;
		mensalidade = 50.00;
		System.out.println("Digite as horas do cliente: ");
		horas_cliente = sc.nextInt();

		if (horas_cliente <= 100) {
			System.out.println("Valor a pagar: R$ 50,00");
		} else {
			mensalidade_excedente = (horas_cliente - 100) * 2 + mensalidade;
			System.out.printf("Valor a pagar: %.2f%n", mensalidade_excedente);

		}

		sc.close();
	}

}
