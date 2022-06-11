

import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Login {
    public static String login() {
        Scanner tec = new Scanner(System.in);
        String conteudo = "",cpf,perfilLine="",checkLine;


        /*
         * Formulario com cpf
         */
        System.out.println("-----------------------------------");
        System.out.print("Informe o seu CPF: ");
        cpf = tec.nextLine();
        System.out.println("-----------------------------------");
        HelperClasses.cls();
        while (cpf == "" || cpf.length() != 11 || cpf.matches("[0-9]+") == false) {
            System.out.println("-----------------------------------");
            System.out.println("Por favor, informe seu CPF corretamente");
            System.out.println("-----------------------------------");
            System.out.print("Informe o seu CPF: ");
            cpf = tec.nextLine();
            HelperClasses.cls();
        }

        try {
            File file = new File("Clientes.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            line = br.readLine();

            while (line != null && perfilLine.equals("")) {

                checkLine = HelperClasses.searchInfo(line, "cpf");

                if(checkLine.equals(cpf)){
                    perfilLine = line;
                }
                line = br.readLine();
            }
            br.close();
            if(!perfilLine.equals("")){
                //se perfilLine for diferente de "" significa que encontrou a linha com o cpf do usuario
                System.out.printf("Seja bem Vindo %s!",HelperClasses.searchInfo(perfilLine, "nome"));
                return perfilLine; //retorna a linha de Clientes.txt com todas as informacoes do usuario
            }
            else{
                System.out.println("Nenhum usuario encontrado");
                return "";
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }



}