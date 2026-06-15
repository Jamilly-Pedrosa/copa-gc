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
}