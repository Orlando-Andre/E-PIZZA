

import java.util.Scanner;

public class pagamento {
    
	public static void pagamento() {
		Scanner dado = new Scanner(System.in);
		char escolha, troco;
		int pagamento = 0, valorTroco, nCartao, codigo;
		float totalPedido = 0.0f;

		String resumoPizzaDoce="", resumoPizzaSal="", resumoBebidas="";
		float totalPizzaSal,totalPizzaDoce,totalBebidas;

		resumoPizzaSal = menuPizzaSal.resumoPizzaSal();
        totalPizzaSal = menuPizzaSal.totalPizzaSal();
        resumoPizzaDoce = PedidoPizzaDoce.resumoPizzaDoce();
        totalPizzaDoce = PedidoPizzaDoce.totalPizzaDoce();
        resumoBebidas = menuBebidas.resumoBebidas();
        totalBebidas = menuBebidas.totalBebidas();

        totalPedido = totalPizzaSal + totalPizzaDoce + totalBebidas;


		System.out.print("**************** RESUMO DO PEDIDO ****************");
		System.out.println(resumoPizzaSal);
        System.out.println(resumoPizzaDoce);
        System.out.println(resumoBebidas);
        System.out.printf("total do pedido R$ %.2f\n",totalPedido);
		System.out.printf("Confirmar pedido: (S)-sim ou (N)-não: ");
		escolha = dado.next().charAt(0);
		System.out.print("\n");
		if (escolha == 'S' || escolha == 's') {
		    System.out.println("******** FORMA DE PAGAMENTO ********");
		    System.out.println("1 - Dinheiro");
		    System.out.println("2 - Cartão");
		    System.out.println("3 - Pix");
		    System.out.print("opcao -->: ");
		    pagamento = dado.nextInt();
		    if (pagamento == 1) {
		        System.out.println("Precisa de troco: (S)-sim ou (N)-não: ");
		        troco = dado.next().charAt(0);
		        if(troco == 'S' || troco == 's') {
		            System.out.println("Troco para quantos reais: ");
		            valorTroco = dado.nextInt();
		            System.out.println("Pedido confirmado.");
		        }
                else{
                    System.out.println("Pedido confirmado.");
                }
		    } 
            else {
		        if(pagamento == 2) {
		            // Imprimir nome e CPF arquivo Alexandre txt
					System.out.printf("total do pedido R$ %.2f\n\n",totalPedido);
		            System.out.print("Digite o número do cartão: ");
    		        nCartao = dado.nextInt();
		            System.out.print("Digite o código de segurança: ");
		            codigo = dado.nextInt();
		            System.out.println("Pagamento e pedido confirmado.");
		        } 
				else {
					System.out.println("*********** P I X ***********");
		            System.out.println("CNPJ: 04.201.345/0008-55");
		            System.out.println("Pagamento e pedido confirmado.");
		        }
		    } 
		} 
		dado.close();
	}
}