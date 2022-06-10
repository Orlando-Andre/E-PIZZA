import java.util.Scanner;
public class Pedido {
    public static void pedido() {
        Scanner dado = new Scanner(System.in);
        float totalPizzaSal,totalPizzaDoce,totalBebidas, totalPedido = 0.0f;
        System.out.print("Digite o CPF: ");
        // ? preciso saber qual a variavel
        // validar cpf

        menuPizzaSal.menuPizzaSal();


        totalPizzaSal = menuPizzaSal.totalPizzaSal();
        totalPizzaDoce = PedidoPizzaDoce.totalPizzaDoce();
        totalBebidas = menuBebidas.totalBebidas();
        totalPedido = totalPizzaSal + totalPizzaDoce + totalBebidas;

        if (totalPedido > 0.0f){
            pagamento.pagamento();
        }
        System.out.print("*********** AGRADECEMOS A PREFERÊNCIA! ***********");
        dado.close();
    }
}