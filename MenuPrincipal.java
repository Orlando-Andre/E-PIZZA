
import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
	public static void menu(String account) {
		Scanner dado = new Scanner(System.in);
		int op;
		do {
			System.out.println();
			System.out.println("\n************ E-PIZZA ************\n");
			System.out.println("< 1 > PEDIDO");
			System.out.println("< 2 > ATUALIZAR CADASTRO");
			System.out.println("< 3 > Sair");

			System.out.print("Opcao --> ");
			op = dado.nextInt();
			switch (op) {
				case 1:
					Pedido.pedido();
					op = 4;
					break;
				case 2:
					Atualizar.atualizar(account);
					break;
				case 3:
					System.out.print("*********** AGRADECEMOS A PREFERENCIA! ***********");
					op = 4;
					break;
				default:
					System.out.println("Opcao Invalida");
			}
		} while (op != 4);
		dado.close();
	}
}