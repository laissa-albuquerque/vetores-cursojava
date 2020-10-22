package principal;

import java.util.Scanner;

import entidades.Aluguel;
import entidades.Pensionato;

public class App {

	public static void main(String[] args) {

		Pensionato pensionato = new Pensionato();

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas quartos serão alugados? ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Numero: ");
			Integer numero = sc.nextInt();

			pensionato.registraAluguel(new Aluguel(nome, email, numero));

		}

		for (int i = 0; i < 10; i++) {
			if (pensionato.getRoom()[i] != null) {
				System.out.println(pensionato.getRoom()[i].toString());
			}

		}

	}

}
