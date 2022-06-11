

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Cadastro {
    public static void cadastro() {
        Scanner tec = new Scanner(System.in);

        String nome = "", email = "", celular = "", cpf = "", rua = "", bairro = "", complemento = "";
        Boolean checkCloneBoolean;

        /*
         * Inicio do formulario de cadastro
         */
        System.out.println("-----------------------------------");
        System.out.print("Informe o seu nome completo: ");
        nome = tec.nextLine();
        System.out.println("-----------------------------------");
        HelperClasses.cls();
        while (nome == "" || nome.indexOf(" ") == -1) {
            //Enquanto nome for vazio ou nao tiver espaco( Nome completo )
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe seu nome completo corretamente");
            System.out.println();
            System.out.print("Informe o seu nome completo: ");
            nome = tec.nextLine();
            System.out.println("-----------------------------------");
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.print("Informe o seu e-mail: ");
        email = tec.nextLine();
        System.out.println("-----------------------------------");
        HelperClasses.cls();
        checkCloneBoolean = HelperClasses.checkClone("e-mail",email);
        while (email == "" || email.indexOf("@") == -1 || email.indexOf(".com") == -1 || checkCloneBoolean ) {
            //Enquanto email for vazio, nao tiver "@"" ou ".com", repetir de um dos outros clientes( apenas um email )
            System.out.println("-----------------------------------");
            if(checkCloneBoolean){
                System.out.println("E-mail informado ja existe, Por favor informe outro nao cadastrado ainda");
            }else{
                System.out.println("Por favor, informe seu e-mail corretamente");
            }
            System.out.println();
            System.out.print("Informe o seu e-mail: ");
            email = tec.nextLine();
            System.out.println("-----------------------------------");
            checkCloneBoolean = HelperClasses.checkClone("cpf",cpf);
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.print("Informe o seu numero de telefone: ");
        celular = tec.nextLine();
        System.out.println("-----------------------------------");
        HelperClasses.cls();
        while (celular == "" || celular.length() < 9 || celular.length() > 13 || celular.matches("[0-9]+") == false) {
            //Enquanto celular for vazio, nao tiver entra 9 a 12 numeros ( (00) 0 0000-0000 ), for diferente de numero
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe seu numero de telefone corretamente");
            System.out.println();
            System.out.print("Informe o seu numero de telefone: ");
            celular = tec.nextLine();
            System.out.println("-----------------------------------");
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.print("Informe o seu CPF: ");
        cpf = tec.nextLine();
        System.out.println("-----------------------------------");
        HelperClasses.cls();
        checkCloneBoolean = HelperClasses.checkClone("cpf",cpf);
        while (cpf == "" || cpf.length() != 11 || cpf.matches("[0-9]+") == false || checkCloneBoolean || !HelperClasses.validarCPF(cpf)) {
            //Enquantro cpf for vazio, tamanho diferente de 11, for diferente de numeros,  repetir de um dos outros clientes( apenas um cpd ), nao for um cpf valido
            System.out.println("-----------------------------------");
            if(checkCloneBoolean){
                System.out.println("CPF informado ja existe, Por favor informe outro nao cadastrado ainda");
            }else{
                System.out.println("Por favor, informe seu CPF corretamente");
            }
            System.out.println();
            System.out.print("Informe o seu CPF: ");
            cpf = tec.nextLine();
            System.out.println("-----------------------------------");
            checkCloneBoolean = HelperClasses.checkClone("cpf",cpf);

            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.print("Informe o sua Rua: ");
        rua = tec.nextLine();
        System.out.println("-----------------------------------");
        HelperClasses.cls();
        while (rua == "") {
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe sua Rua corretamente");
            System.out.println();
            System.out.print("Informe a sua Rua: ");
            rua = tec.nextLine();
            System.out.println("-----------------------------------");
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.print("Informe o seu Bairro: ");
        bairro = tec.nextLine();
        System.out.println("-----------------------------------");
        HelperClasses.cls();
        while (bairro == "") {
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe seu Bairro corretamente");
            System.out.println();
            System.out.print("Informe o seu Bairro: ");
            bairro = tec.nextLine();
            System.out.println("-----------------------------------");
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.print("Informe o Complemento( Opcional ): ");
        complemento = tec.nextLine();
        System.out.println("-----------------------------------");
        if(complemento == ""){
            complemento = " ";
        }
        HelperClasses.cls();

        /*
         * Fim do formulario de cadastro
         */
        try {
            File file = new File("Clientes.txt"); // dados dos clientes
            FileWriter fw = new FileWriter(file, true);
            fw.write("nome::" + nome + "::e-mail::" + email + "::telefone::" + celular + "::cpf::" + cpf + "::rua::"
                    + rua + "::bairro::" + bairro + "::complemento::" + complemento + "::\r\n"); 
            fw.flush();// Adiciona uma nova linha com as infoemacoes do nvo cliente
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}