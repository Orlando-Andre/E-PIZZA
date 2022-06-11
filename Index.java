import java.util.Scanner;

public class Index {

    public static String accountLine=""; // Variavel global do cadastro
    public static void main(String[] args){
        int selectMethod;
        // String accountLine;
        Scanner tec = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("1 - Fazer Login");
        System.out.println("2 - Cadastro");
        System.out.println("-----------------------------------");
        System.out.print("Opcao -->");
        selectMethod = tec.nextInt();
        HelperClasses.cls();
        while(selectMethod > 2 && selectMethod <1){
            // System.out.println(selectMethod!=1);
            System.out.println("-----------------------------------");
            System.out.println("1 - Fazer Login");
            System.out.println("2 - Cadastro");
            System.out.println("-----------------------------------");
            System.out.print("Opcao -->");
            selectMethod = tec.nextInt();
            HelperClasses.cls();
        }
        if(selectMethod == 1){
            System.out.println("-----------------------------------");
            System.out.println("Faca seu Login");
            
            accountLine = Login.login();
            HelperClasses.cls();
            if(!accountLine.equals("")){
                MenuPrincipal.menu(accountLine);
            }
            // Atualizar.atualizar(accountLine);

        }
        else{
            Cadastro.cadastro();
            HelperClasses.cls();
            System.out.println("-----------------------------------");
            System.out.println("Faca seu Login");
            accountLine = Login.login();
            HelperClasses.cls();
            if(!accountLine.equals("")){
                MenuPrincipal.menu(accountLine);
            }
        }
        // System.out.println(accountLine);
    }
}