
import java.util.Scanner;

import javax.swing.undo.CompoundEdit;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Atualizar {

    public static void atualizar(String account) {
        //account = linha do Cliente.txt que contem as informcoes dess usuario
        Scanner tec = new Scanner(System.in);

        String nomeAccount = HelperClasses.searchInfo(account,"nome"), emailAccount = HelperClasses.searchInfo(account,"e-mail"), celularAccount = HelperClasses.searchInfo(account,"telefone"), cpfAccount = HelperClasses.searchInfo(account,"cpf"), ruaAccount= HelperClasses.searchInfo(account,"rua"), bairroAccount = HelperClasses.searchInfo(account,"bairro"), complementoAccount = HelperClasses.searchInfo(account,"complemento"),
         conteudo = "",nome = "", email = "", celular = "", cpf = "", rua = "", bairro = "", complemento = "";

     
        /*
         * Inicio do formulario de cadastro
         */
        System.out.println("-----------------------------------");
        System.out.printf("informacao cadastrada: '%s'%n", nomeAccount);
        System.out.println();
        System.out.println("( Pressione 'Enter' para nao alterar o valor )");
        System.out.print("Informe o seu nome completo: ");
        nome = tec.nextLine();
        System.out.println("-----------------------------------");
        if(nome ==""){
            nome = nomeAccount;
        }
        HelperClasses.cls();
        while (nome != "" && nome.indexOf(" ") == -1) {
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe seu nome completo corretamente");
            System.out.println();
            System.out.println("( Pressione 'Enter' para nao alterar o valor )");
            System.out.print("Informe o seu nome completo: ");
            nome = tec.nextLine();
            System.out.println("-----------------------------------");
            if(nome ==""){
                nome = nomeAccount;
            }
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.printf("informacao cadastrada: '%s'%n", emailAccount);
        System.out.println();
        System.out.println("( Pressione 'Enter' para nao alterar o valor )");
        System.out.print("Informe o seu e-mail: ");
        email = tec.nextLine();
        System.out.println("-----------------------------------");
        if(email ==""){
            email = emailAccount;
        }
        HelperClasses.cls();
        while (email != "" &&( email.indexOf("@") == -1 || email.indexOf(".com") == -1)) {
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe seu e-mail corretamente");
            System.out.println();
            System.out.println("( Pressione 'Enter' para nao alterar o valor )");
            System.out.print("Informe o seu e-mail: ");
            email = tec.nextLine();
            System.out.println("-----------------------------------");
            if(email ==""){
                email = emailAccount;
            }
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.printf("informacao cadastrada: '%s'%n", celularAccount);
        System.out.println();
        System.out.println("( Pressione 'Enter' para nao alterar o valor )");
        System.out.print("Informe o seu numero de telefone: ");
        celular = tec.nextLine();
        System.out.println("-----------------------------------");
        if(celular ==""){
            celular = celularAccount;
        }
        HelperClasses.cls();
        while (celular !="" && ( celular.length() < 9 || celular.length() > 13 || celular.matches("[0-9]+") == false)) {
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe seu numero de telefone corretamente");
            System.out.println();
            System.out.println("( Pressione 'Enter' para nao alterar o valor )");
            System.out.print("Informe o seu numero de telefone: ");
            celular = tec.nextLine();
            System.out.println("-----------------------------------");
            if(celular ==""){
                celular = celularAccount;
            }
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.printf("informacao cadastrada: '%s'%n", cpfAccount);
        System.out.println();
        System.out.println("( Pressione 'Enter' para nao alterar o valor )");
        System.out.print("Informe o seu CPF: ");
        cpf = tec.nextLine();
        System.out.println("-----------------------------------");
        if(cpf ==""){
            cpf = cpfAccount;
        }
        HelperClasses.cls();
        while (cpf != "" && (cpf.length() != 11 || cpf.matches("[0-9]+") == false)) {
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe seu CPF corretamente");
            System.out.println();
            System.out.println("( Pressione 'Enter' para nao alterar o valor )");
            System.out.print("Informe o seu CPF: ");
            cpf = tec.nextLine();
            System.out.println("-----------------------------------");
            if(cpf ==""){
                cpf = cpfAccount;
            }
            HelperClasses.cls();
        }

        System.out.println("-----------------------------------");
        System.out.printf("informacao cadastrada: '%s'%n", ruaAccount);
        System.out.println();
        System.out.println("( Pressione 'Enter' para nao alterar o valor )");
        System.out.print("Informe o sua Rua: ");
        rua = tec.nextLine();
        System.out.println("-----------------------------------");
        if(rua ==""){
            rua = ruaAccount;
        }
        HelperClasses.cls();

        System.out.println("-----------------------------------");
        System.out.printf("informacao cadastrada: '%s'%n", bairroAccount);
        System.out.println();
        System.out.println("( Pressione 'Enter' para nao alterar o valor )");
        System.out.print("Informe o seu Bairro: ");
        bairro = tec.nextLine();
        System.out.println("-----------------------------------");
        if(bairro ==""){
            bairro = bairroAccount;
        }
        HelperClasses.cls();

        System.out.println("-----------------------------------");
        System.out.printf("informacao cadastrada: '%s'%n", complementoAccount);
        System.out.println();
        System.out.println("( Pressione 'Enter' para nao alterar o valor )");
        System.out.print("Informe o Complemento( Opcional ): ");
        complemento = tec.nextLine();
        System.out.println("-----------------------------------");
        if(complemento ==""){
            complemento = complementoAccount;
        }
        HelperClasses.cls();

        /*
         * Fim do formulario de cadastro
         */
        try {
            File file = new File("Clientes.txt");
            // FileWriter fw = new FileWriter(file);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            
            line = br.readLine();
            // System.out.println(line);
            while (line != null) {

                String checkLine;
                checkLine = HelperClasses.searchInfo(line, "cpf"); // pega a valor do cpf da linha percorrida
                if (checkLine.equals(cpf)) {
                    //linha percorrida e igual a account
                    conteudo += "nome::" + nome + "::e-mail::" + email + "::telefone::" + celular + "::cpf::" + cpf+ "::rua::"+ rua + "::bairro::" + bairro + "::complemento::" + complemento + "::\r\n";
                } else {
                    conteudo += line + "\r\n";
                }
                line = br.readLine();
            }
            // System.out.println("conteudo: "+conteudo);
            // fw.write(conteudo);
            // fw.flush();
            // fw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            File file = new File("Clientes.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(conteudo);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}