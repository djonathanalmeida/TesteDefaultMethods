package aplicacao;

import java.util.Scanner;

import servicos.Juros;
import servicos.JurosBrasil;
import servicos.JurosEUA;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantia: ");
		Double quantia = sc.nextDouble();
		System.out.println("Meses: ");
		Integer meses = sc.nextInt();

		Juros j = new JurosBrasil(5.0);
		Juros jj = new JurosEUA(10.0);

		System.out.println("Pagamento após " + meses + " meses");
		System.out.println("Valor final Brasil: " + j.pagamento(quantia, meses));
		System.out.println("Valor final EUA: " + jj.pagamento(quantia, meses));

	}

}
