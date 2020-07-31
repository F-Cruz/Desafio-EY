package resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeroiResource {
	
	@JsonProperty("nome_heroi")
	private String nome;
	
	@JsonProperty("poder")
	private String poder;
	
	@JsonProperty("universo")
	private String universo;
	
	@JsonProperty("data de criacao")
	private String dataCriacao;
	
	
	public HeroiResource(String nome, String poder, String universo, String dataCriacao) {
		
		this.nome = nome;
		this.poder = poder;
		this.universo = universo;
		this.dataCriacao = dataCriacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	public String getUniverso() {
		return universo;
	}
	public void setUniverso(String universo) {
		this.universo = universo;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	 
	
}
