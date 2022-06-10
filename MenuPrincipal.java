import java.io.IOException;
import java.util.Scanner;
public class MenuPrincipal {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner dado = new Scanner(System.in);
		int op;
		do{
			System.out.println();
			System.out.println("\n************ E-PIZZA ************\n");
			System.out.println("< 1 > CADASTRO");
			System.out.println("< 2 > PEDIDO");
			System.out.println("< 3 > ATUALIZAR CADASTRO");
			System.out.println("< 4 > Sair");
		
			System.out.print("Opcao --> ");
			op = dado.nextInt();
			switch (op){
				case 1:
					//Cadastro
					break;
				case 2:
					Pedido.pedido();
					op = 4;
					break;
				case 3:
					//Chamar atualizar Cadastro
					break;
                case 4:
                System.out.print("*********** AGRADECEMOS A PREFERÊNCIA! ***********");
                    break;
				default:
					System.out.println("Opcao Inválida");
			}
		} while (op != 4);
		dado.close();
	}
}