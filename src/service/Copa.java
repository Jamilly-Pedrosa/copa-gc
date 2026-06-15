package service;

import java.util.ArrayList;
import java.util.List;

import model.Partida;
import model.Selecao;

public class Copa {

    private List<Selecao> selecoes;
    private List<Partida> partidas;
    private List<String> artilheiros;

    public Copa() {
        selecoes = new ArrayList<>();
        partidas = new ArrayList<>();
        artilheiros = new ArrayList<>();
    }

    public void adicionarSelecao(Selecao selecao) {
        selecoes.add(selecao);
    }

    public void registrarPartida(Partida partida) {
    partidas.add(partida);
    }

    public void listarGrupo(char grupo) {
        for (Selecao selecao : selecoes) {
            if (selecao.getGrupo() == grupo) {
                System.out.println(selecao);
            }
        }
    }

    public void topArtilheiros() {
    for (String artilheiro : artilheiros) {
        System.out.println(artilheiro);
        }
    }

    public void calcularClassificacao() {
        System.out.println("Classificação ainda não disponível.");
    }
}
