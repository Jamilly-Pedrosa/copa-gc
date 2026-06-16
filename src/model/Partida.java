package model;

public class Partida {

    private Selecao mandante;
    private Selecao visitante;
    private int golsMandante;
    private int golsVisitante;

    public Partida(Selecao mandante, Selecao visitante,
                   int golsMandante, int golsVisitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsMandante = golsMandante;
        this.golsVisitante = golsVisitante;
    }

    public Selecao getMandante() {
        return mandante;
    }

    public Selecao getVisitante() {
        return visitante;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    @Override
    public String toString() {
        return mandante.getNome() + " " +
                golsMandante + " x " +
                golsVisitante + " " +
                visitante.getNome();
    }
}