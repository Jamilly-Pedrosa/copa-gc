import java.util.List;
import java.util.Scanner;

import service.Copa;
import util.CargaInicial;
import model.Selecao;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Copa copa = new Copa();
        CargaInicial.popularCopa(copa);

        int opcao;

        do {
            System.out.println("\n=== Copa GC — Menu Principal ===");
            System.out.println("1. Listar selecoes por grupo");
            System.out.println("2. Registrar resultado de partida");
            System.out.println("3. Exibir classificacao do grupo");
            System.out.println("4. Listar artilheiros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:


                case 2:


                case 3:


                case 4:


                case 0:


                default:

            }

        } while (opcao != 0);

        sc.close();
    }
}