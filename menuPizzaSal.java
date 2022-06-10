import java.util.Locale;
import java.util.Scanner;

public class menuPizzaSal {
	
	private static int opcao;
	private static String resumoPizzaSal = "";
	private static float totalPizzaSal = 0.0f;

	public static void menuPizzaSal() {
		Locale.setDefault(Locale.US);
		Scanner dado = new Scanner(System.in);
		int sabor, qtdPizza = 0;
		float valorPizza = 0.0f;
		String pizzaEscolhidaSal = "",strQtdPizza;
		char tamanhoP = ' ';
		System.out.print("\n");
		System.out.print("Digite (1) para pizza de sal ou (2) para  pizza de doce: ");
		opcao = dado.nextInt();
		while(opcao != 0){
			if(opcao == 2){
				PedidoPizzaDoce.PedidoPizzaDoce();
				opcao = 0;
			}
			else{
				while (opcao == 1) {
					
					configMpizza.configMpizza();

					System.out.print("Digite o número da pizza desejada: ");
					sabor = dado.nextInt();
					switch(sabor) {
						case 1: case 3: case 4: case 5:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 28,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 42,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 56,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza =(float)(qtdPizza * 28.00);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * 42.00);
							} 
							else {
								valorPizza =(float) (qtdPizza * 56.00);
							}
						}
						switch(sabor){
							case 1:
							pizzaEscolhidaSal = "Calabresa";
							break;
							case 3:
							pizzaEscolhidaSal = "Quatro Queijos";
							break;
							case 4:
							pizzaEscolhidaSal = "Bacon";
							default:
							pizzaEscolhidaSal = "Frango com Catupiry";
						}
							break;
						case 2: case 10:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 32,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 48,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 64,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float)(qtdPizza * 32.00);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * 48.00);
							}
							else {
								valorPizza = (float)(qtdPizza * 64.00);
							}
						}
						if(sabor == 2){
							pizzaEscolhidaSal = "Portuguesa";
						}
						else{
							pizzaEscolhidaSal = "Paulista";
						}
							
							break;
						case 6:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 23,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 34,50");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 46,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float)(qtdPizza * 23.00);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * 34.50);
							} 
							else {
								valorPizza = (float)(qtdPizza * 46.00);
							}
						}
						pizzaEscolhidaSal = "Atum";
							break;
						case 7:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 24,50");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 36,75");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 49,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);
						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float)(qtdPizza * 24.50);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * 36.75);
							} 
							else {
								valorPizza = (float)(qtdPizza * 49.00);
							}
						}
						pizzaEscolhidaSal = "Mussarela";
							break;
						case 8: case 9:
						System.out.println("P(tamanho pequeno - 4 pedaços) R$ 28,00");
						System.out.println("M(tamanho pequeno - 6 pedaços) R$ 42,00");
						System.out.println("G(tamanho pequeno - 8 pedaços) R$ 56,00");
						System.out.print("Digite P, M, ou G para o tamanho desejado: ");
						tamanhoP = dado.next().charAt(0);

						System.out.print("Digite a quantidade: ");
						qtdPizza = dado.nextInt();
						if (tamanhoP == 'P' || tamanhoP == 'p') {
							valorPizza = (float) (qtdPizza * 28.00);
						} 
						else {
							if (tamanhoP == 'M' || tamanhoP == 'm') {
								valorPizza = (float)(qtdPizza * 42.00);
							} 
							else {
							valorPizza = (float)(qtdPizza * 56.00);
							}
						}
						if(sabor == 8){
							pizzaEscolhidaSal = "Presunto";
						}
						else{
							pizzaEscolhidaSal = "Napolitana";
						}
						break;	
					}

					strQtdPizza = String.valueOf(qtdPizza);
					resumoPizzaSal = resumoPizzaSal + "\n" + strQtdPizza + " Pizza de " + pizzaEscolhidaSal + " " + tamanhoP;
					totalPizzaSal = totalPizzaSal + valorPizza;
					System.out.printf("%-10s\n",resumoPizzaSal);
					System.out.printf("total R$ %-10.2f\n\n",totalPizzaSal);
					System.out.print("Deseja mais alguma pizza de sal? (1)sim (00)Não: ");
					opcao = dado.nextInt();
				}
				if( opcao == 00){
					System.out.print("Deseja alguma pizza de doce? (2)sim (0)Não: ");
					opcao = dado.nextInt();
					if(opcao == 0){
							menuBebidas.menuBebidas();
					opcao = 0;
					}
				}
			}
		}
	}
	public static int opcao(){
		return opcao;
	}
	public static String resumoPizzaSal(){
		return resumoPizzaSal;
	}
	public static float totalPizzaSal(){
		return totalPizzaSal;
	}
}
				