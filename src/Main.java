import java.util.List;
import java.util.Scanner;

import model.Partida;
import model.Selecao;
import service.Copa;
import util.CargaInicial;

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

                // ---------------- OPCÃO 1 ----------------
                case 1:
                    System.out.print("Digite o grupo (A ou B): ");
                    char grupo = sc.next().toUpperCase().charAt(0);

                    List<Selecao> selecoes = copa.listarSelecoesPorGrupo(grupo);

                    System.out.println("\n=== Grupo " + grupo + " ===");
                    for (Selecao s : selecoes) {
                        System.out.println(s);
                    }
                    break;

                // ---------------- OPCÃO 2 ----------------
                case 2:
                    System.out.println("\n=== Registrar Partida ===");

                    System.out.print("Código FIFA mandante: ");
                    String codM = sc.next().toUpperCase();

                    System.out.print("Código FIFA visitante: ");
                    String codV = sc.next().toUpperCase();

                    System.out.print("Gols mandante: ");
                    int golsM = sc.nextInt();

                    System.out.print("Gols visitante: ");
                    int golsV = sc.nextInt();

                    Selecao mandante = null;
                    Selecao visitante = null;

                    for (Selecao s : copa.listarSelecoesPorGrupo('A')) {
                        if (s.getCodigoFIFA().equals(codM)) mandante = s;
                        if (s.getCodigoFIFA().equals(codV)) visitante = s;
                    }

                    for (Selecao s : copa.listarSelecoesPorGrupo('B')) {
                        if (s.getCodigoFIFA().equals(codM)) mandante = s;
                        if (s.getCodigoFIFA().equals(codV)) visitante = s;
                    }

                    if (mandante == null || visitante == null) {
                        System.out.println("Times não encontrados!");
                        break;
                    }

                    copa.registrarPartida(
                            new Partida(mandante, visitante, golsM, golsV)
                    );

                    System.out.println("Partida registrada com sucesso!");
                    break;

                // ---------------- OPCÃO 3 ----------------
                case 3:
                    System.out.print("Digite o grupo (A ou B): ");
                    char g = sc.next().toUpperCase().charAt(0);

                    List<Selecao> lista = copa.listarSelecoesPorGrupo(g);

                    System.out.println("\n=== Classificação Grupo " + g + " ===");

                    for (Selecao s : lista) {

                        int pontos = 0;

                        for (Partida p : copa.getPartidas()) {

                            // mandante
                            if (p.getMandante().equals(s)) {
                                if (p.getGolsMandante() > p.getGolsVisitante())
                                    pontos += 3;
                                else if (p.getGolsMandante() == p.getGolsVisitante())
                                    pontos += 1;
                            }

                            // visitante
                            if (p.getVisitante().equals(s)) {
                                if (p.getGolsVisitante() > p.getGolsMandante())
                                    pontos += 3;
                                else if (p.getGolsVisitante() == p.getGolsMandante())
                                    pontos += 1;
                            }
                        }

                        System.out.println(s.getCodigoFIFA() + " - " + pontos + " pts");
                    }
                    break;

                // ---------------- OPCÃO 4 ----------------
                case 4:
                    System.out.println("\n=== Artilheiros ===");
                    for (String a : copa.topArtilheiros()) {
                        System.out.println(a);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}