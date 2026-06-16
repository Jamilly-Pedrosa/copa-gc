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
        this.selecoes = new ArrayList<>();
        this.partidas = new ArrayList<>();
        this.artilheiros = new ArrayList<>();
    }

    public void adicionarSelecao(Selecao selecao) {
        if (selecao != null) {
            selecoes.add(selecao);
        }
    }

    public List<Selecao> listarSelecoesPorGrupo(char grupo) {
        List<Selecao> resultado = new ArrayList<>();

        for (Selecao s : selecoes) {
            if (s.getGrupo() == grupo) {
                resultado.add(s);
            }
        }

        return resultado;
    }

    public void registrarPartida(Partida partida) {
        if (partida != null) {
            partidas.add(partida);
        }
    }

    public List<Partida> getPartidas() {
        return partidas;
    }


    public void adicionarArtilheiro(String artilheiro) {
        if (artilheiro != null && !artilheiro.isEmpty()) {
            artilheiros.add(artilheiro);
        }
    }

    public List<String> topArtilheiros() {
        return artilheiros;
    }

    public void calcularClassificacao() {
        // futuramente: pontos, vitórias, saldo de gols etc.
        System.out.println("Classificação ainda não implementada.");
    }
}