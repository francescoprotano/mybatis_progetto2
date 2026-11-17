package it.exolab.model;

public class Corso {
	
	private Long id;
	private String nome;
	private String aula;
	private String argomento;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public String getArgomento() {
		return argomento;
	}
	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}
	public Corso(String nome, String aula, String argomento) {
		super();
		this.nome = nome;
		this.aula = aula;
		this.argomento = argomento;
	}
	public Corso() {
		super();
		
	}
	

}
