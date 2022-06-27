package model;

import java.math.BigDecimal;
import java.time.LocalDate;
public class Funcionario {

	private String nome;
	private String cpf;
	private Cargo cargo ;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;
	
	
	public void atualizarSalario(BigDecimal valorAAtualizar) {
		this.salario = valorAAtualizar;
		this.dataUltimoReajuste = LocalDate.now();
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}
	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	
	
	
}
