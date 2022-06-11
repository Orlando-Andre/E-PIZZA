

import java.util.Locale;
import java.util.Scanner;
public class menuBebidas {
    private static float totalBebidas = 0.0f;
    private static String resumoBebidas = "";
    public static void menuBebidas(){
        Locale.setDefault(Locale.US);
        Scanner dado = new Scanner(System.in);
        int opBebidas, qtdBebidas = 0, opcao;
        float valorBebidas = 0.0f;
        String tamanho  = "", bebidaEscolhida = "", sabor = "";
        String strQtdBebidas = "", bebidas = "";

        System.out.print("Deseja alguma bebida? Digite (1)sim ou (0)Não : ");
        opcao = dado.nextInt();
        System.out.print("\n");
        while(opcao == 1){

            configMbebidas.configMbebidas();

            System.out.print("Opcao --> ");
            opBebidas = dado.nextInt();
            switch (opBebidas) {
                case 1: case 2: case 3: case 4:
                    System.out.print("Digite Lata, 1L ou 2L para o tamanho: ");
                    tamanho = dado.next();
                    System.out.print("Digite a quantidade: ");
                    qtdBebidas = dado.nextInt();
                    if (tamanho.equals("Lata")) {
                        valorBebidas = (float) (qtdBebidas * 4.50);
                    } else {
                        if (tamanho.equals("1L")) {
                            valorBebidas = (float) (qtdBebidas * 6.00);
                        } else {
                            valorBebidas = (float) (qtdBebidas * 9.00);
                        }
                    }
                    switch (opBebidas) {
                        case 1:
                            bebidaEscolhida = "Coca Cola";
                            break;
                        case 2:
                            bebidaEscolhida = "Sprite";
                            break;
                        case 3:
                            bebidaEscolhida = "Guaraná";
                            break;
                        default:
                            bebidaEscolhida = "Kuat";
                    }
                    break;
                case 5: case 6:
                    System.out.print("Digite a quantidade: ");
                    qtdBebidas = dado.nextInt();
                    tamanho = "Longneck";
                    valorBebidas= (float) (qtdBebidas * 8.0);
                    if (opBebidas == 5) {
                        bebidaEscolhida = "Heineken";
                    } else {
                        bebidaEscolhida = "Amstel";
                    }
                    break;
                case 7:  case 8: case 9:
                    System.out.print("Digite a quantidade: ");
                    qtdBebidas = dado.nextInt();
                    valorBebidas = (float) (qtdBebidas * 3.5);
                    tamanho = "Lata";
                    switch (opBebidas) {
                        case 7:
                            bebidaEscolhida = "Skol";
                            break;
                        case 8:
                            bebidaEscolhida = "Brahma";
                            break;
                        default:
                            bebidaEscolhida = "Antarctica";
                    }
                    break;
                case 10:
                    System.out.print("Digite o sabor: ");
                    sabor = dado.next();
                    System.out.print("Digite a quantidade: ");
                    qtdBebidas = dado.nextInt();
                    valorBebidas = (float) (qtdBebidas * 5.0);
                    bebidaEscolhida = "Suco Natural";
                    tamanho = "500ml";
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Opcao Inválida");
            } 
            if(opBebidas == 11){
                opcao = 0;
            }
            else{
                bebidas = bebidaEscolhida + " " + sabor;
                strQtdBebidas = String.valueOf(qtdBebidas);
                resumoBebidas= resumoBebidas + "\n"+ strQtdBebidas + " "+ bebidas+"(s) "+ tamanho;
                totalBebidas = totalBebidas + valorBebidas;
                System.out.printf("%-10s\n",resumoBebidas);
                System.out.printf("total R$ %.2f\n\n",totalBebidas);
                sabor = "";
                System.out.print("Deseja mais alguma bebida? (1)sim ou (0)Não: ");
                opcao = dado.nextInt();
                System.out.print("\n");
            }
        }
    }
    public static String resumoBebidas(){
        return resumoBebidas;
    }
    public static float totalBebidas(){
        return totalBebidas;
    }
}
