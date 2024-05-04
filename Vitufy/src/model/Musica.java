package model;

public class Musica {

	private String nome;
	private String nomeartista;
	private int duracao;
	
	
	
	public Musica(String nome, String nomeartista, int duracao) {
		this.nome = nome;
		this.nomeartista = nomeartista;
		this.duracao = duracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeartista() {
		return nomeartista;
	}
	public void setNomeartista(String nomeartista) {
		this.nomeartista = nomeartista;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "[ Música:" + this.nome + "-Artista:" + this.nomeartista + "-Duração:" + this.duracao + " ]";
	}
	
}
