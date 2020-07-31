package datasource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_heroi")
public class Heroi  implements Serializable{

	private static final long serialVersionUID = 6789437604798269383L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	private String poder;
	private String universo;
	
	@Column(name= "data_criacao")
	private String dataCriacao;
	
	public Heroi() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getData_criacao() {
		return dataCriacao;
	}
	public void setData_criacao(String data_criacao) {
		this.dataCriacao = data_criacao;
	}
	
	
	

}
