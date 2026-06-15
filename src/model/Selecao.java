package model;

public class Selecao {
	
	private String nome;
    private char grupo;
    private String codigoFIFA;
    
    public Selecao(String nome, char grupo, String codigoFIFA) {
        this.nome = nome;
        this.grupo = grupo;
        this.codigoFIFA = codigoFIFA;
    }
    
 	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getGrupo() {
		return grupo;
	}
	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}
	
	public String getCodigoFIFA() {
		return codigoFIFA;
	}
	public void setCodigoFIFA(String codigoFIFA) {
		this.codigoFIFA = codigoFIFA;
	}
	
	@Override
    public String toString() {
        return nome + " | Grupo " + grupo + " | FIFA: " + codigoFIFA;
    }
}
