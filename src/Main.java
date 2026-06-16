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
                    System.out.print("Digite o grupo (A ou B): ");
                    char grupo = sc.next().toUpperCase().charAt(0);

                    List<Selecao> selecoes = copa.listarSelecoesPorGrupo(grupo);

                    System.out.println("\n=== Seleções do Grupo " + grupo + " ===");
                    for (Selecao s : selecoes) {
                        System.out.println(s);
                    }
                    break;

                case 2:

                case 3:

                case 4:
                    System.out.println("\n=== Artilheiros ===");
                    for (String a : copa.topArtilheiros()) {
                        System.out.println(a);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}