package it.exolab.model;

public class Studente {

	private Long id;
	private String nome;
	private String cognome;
	private String email;
	private Long id_corso;
	private Corso corso;
	
	public Corso getCorso() {
		return corso;
	}
	public void setCorso(Corso corso) {
		this.corso = corso;
	}
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
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId_corso() {
		return id_corso;
	}
	public void setId_corso(Long id_corso) {
		this.id_corso = id_corso;
	}
	public Studente(String nome, String cognome, String email, Long id_corso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.id_corso = id_corso;
	}
	
	public Studente() {
		super();
		
	}
}
