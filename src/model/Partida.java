package model;

public class Partida {
	
	private Selecao mandante;
    private Selecao visitante;
    private int golsA;
    private int golsB;

    public Partida(Selecao mandante, Selecao visitante,
                   int golsA, int golsB) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsA = golsA;
        this.golsB = golsB;
    }

    public Selecao getMandante() {
        return mandante;
    }

    public Selecao getVisitante() {
        return visitante;
    }

    public int getGolsA() {
        return golsA;
    }

    public int getGolsB() {
        return golsB;
    }

    @Override
    public String toString() {
        return mandante.getNome() + " "
                + golsA + " x "
                + golsB + " "
                + visitante.getNome();
    }

}
