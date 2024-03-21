package cometecja.testingspringbootapplication.entidade;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity


public class aluno implements Serializable{



	private static final long serialVersionUID = 1L;

public class Aluno{
	
		
	@Id
	private String matricula; // primary key 
	private String codCurso; // foreingn key 
	private String nome;
	private String endereco;
	private String email;
	private String cpf;
	private String rg;
	private Date dt_entrada;
	private Date dt_termino;
	private String trancado;
	
	public Aluno () {
		
	}

	public Aluno(String nome, int number, String endereco, String email, String cpf, String rg, Date dt_entrada,
			Date dt_termino, String trancado) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.dt_entrada = dt_entrada;
		this.dt_termino = dt_termino;
		this.trancado = trancado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDt_entrada() {
		return dt_entrada;
	}

	public void setDt_entrada(Date dt_entrada) {
		this.dt_entrada = dt_entrada;
	}

	public Date getDt_termino() {
		return dt_termino;
	}

	public void setDt_termino(Date dt_termino) {
		this.dt_termino = dt_termino;
	}

	public String getTrancado() {
		return trancado;
	}

	public void setTrancado(String trancado) {
		this.trancado = trancado;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}
}
		}
