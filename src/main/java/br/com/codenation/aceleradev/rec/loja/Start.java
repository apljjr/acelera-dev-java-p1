package br.com.codenation.aceleradev.rec.loja;
import java.sql.SQLException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws SQLException {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite CPF para logar no sistema:");
        while(sc.hasNext()){
            i++;

            //// TODO: 02/02/2019

            System.out.println("Comando: "+sc.next());
            System.out.println("Próximo comando:");
        }
        sc.close();

    }
}
