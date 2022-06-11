

import java.io.*;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class  configMbebidas {
    private static Scanner arqEnt;
    public static void configMbebidas() {
        abreArqLeitura();
        leRegistro();
        fechaArqLeit();
	}
    private static void abreArqLeitura() {
        try {
            arqEnt = new Scanner(new File("cardapioBebidas.txt")).useDelimiter("\\\\\n");;
        }
        catch(FileNotFoundException fileNotFoundException) {
            System.err.println("Erro na abertura do arquivo");
            System.exit(1);
        }
    }
    private static void leRegistro() {
        String linha;
        try{
            while (arqEnt.hasNext()) { 
            linha = arqEnt.next();
            System.out.printf("%s", linha); } 
        }
        catch(NoSuchElementException elementException) {
            System.err.println("Arquivo corrompido");
            arqEnt.close();
            System.exit(1);
        }
        catch(IllegalStateException stateException) {
            System.err.println("Erro na leitura do arquivo");
            System.exit(1);
        }
    }
    private static void fechaArqLeit() {
        if (arqEnt != null) {
            arqEnt.close();
        }
    }
}