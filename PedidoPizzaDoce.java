

import java.util.Locale;
import java.util.Scanner;

public class PedidoPizzaDoce {
    private static String resumoPizzaDoce ="";
	private static float totalPizzaDoce = 0.0f;

	public static void PedidoPizzaDoce() {
		Locale.setDefault(Locale.US);
		Scanner dado = new Scanner(System.in);
		int opcao, sabor, qtdPizza = 0;
		float P, M, G, valorPizza = 0.0f;
		String strQtdPizzaDoce="",pizzaEscolhidaDoce ="";
		char tamanhoP = ' ';
		opcao = menuPizzaSal.opcao();
		while(opcao != 0){
			if(opcao == 1){
				menuPizzaSal.menuPizzaSal();
			}
			else{	
				while (opcao == 2) {

					configMpizza.configMpizza();

					System.out.print("Digite o número da pizza desejada: ");
					sabor = dado.nextInt();
					switch(sabor) {
						case 1:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 12,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 18,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 24,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						P = 12.0f; M = 18.0f; G = 24.0f;
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float)(qtdPizza * P);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * M);
							}
							else {
								valorPizza = (float)(qtdPizza * G);
							}
						}
						pizzaEscolhidaDoce = "Brigadeiro";
							break;
						case 2:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 18,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 27,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 36,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						P = 18.0f; M = 27.0f; G = 36.0f;
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float)(qtdPizza * P);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * M);
							} 
							else {
								valorPizza = (float)(qtdPizza * G);
							}
						}
						pizzaEscolhidaDoce = "Banana com Canela";
							break;
						case 3:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 20,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 30,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 40,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						P = 20.0f; M = 30.0f; G = 40.0f;
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float)(qtdPizza * P);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * M);
							} 
							else {
								valorPizza = (float)(qtdPizza * G);
							}
						}
						pizzaEscolhidaDoce = "Banana com Mussarela";
							break;
						case 4:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 24,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 36,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 48,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						P = 24.0f; M = 36.0f; G = 48.0f;
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float)(qtdPizza * P);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * M);
							} 
							else {
								valorPizza = (float)(qtdPizza * G);
							}
						}
						pizzaEscolhidaDoce = "Banana Com Chocolate";
							break;
						case 5:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 28,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 42,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 56,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						P = 28.0f; M = 42.0f; G = 56.0f;
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza =(float)(qtdPizza * P);
						}
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * M);
							} 
							else {
							valorPizza = (float)(qtdPizza * G);
							}
						}
						pizzaEscolhidaDoce = "Prestígio";
							break;
						case 6:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 32,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 48,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 64,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						P = 32.0f; M = 48.0f; G = 64.0f;
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float)(qtdPizza * P);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float) (qtdPizza * M);
							} 
							else {
								valorPizza = (float)(qtdPizza * G);
							}
						}
						pizzaEscolhidaDoce = "Romeu e Julieta";
						break;
					}
					strQtdPizzaDoce = String.valueOf(qtdPizza);
					resumoPizzaDoce = resumoPizzaDoce +"\n" + strQtdPizzaDoce + " Pizza(s) de " + pizzaEscolhidaDoce + " " + tamanhoP;
					totalPizzaDoce = totalPizzaDoce + valorPizza;
					System.out.printf("%-10s\n",resumoPizzaDoce);
					System.out.printf("total R$ %-10.2f\n\n",totalPizzaDoce);
					System.out.print("Deseja mais alguma pizza de doce? (2)sim (0)Não: ");
					opcao = dado.nextInt();
				}
			}
			if( opcao == 0){
				System.out.print("Deseja mais alguma pizza ? (1)sim (0)Não: ");
				opcao = dado.nextInt();
				if(opcao == 0) {
					menuBebidas.menuBebidas();
					opcao = 00;
				}else{
					menuPizzaSal.menuPizzaSal();
				}
			}
			opcao = 0;
		}
	}
	public static String resumoPizzaDoce(){
		return resumoPizzaDoce;
	}
	public static  float totalPizzaDoce(){
		return totalPizzaDoce;
	}
}

