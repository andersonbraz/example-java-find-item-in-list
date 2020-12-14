package br.com.solution.model;

import java.util.List;

public class Cliente {
	
	
	public String nome;
	public String telefone;
	public String email;
	public List<Preferencia> listPreferencias;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public List<Preferencia> getListPreferencias() {
		return listPreferencias;
	}

	public void setListPreferencias(List<Preferencia> listPreferencias) {
		this.listPreferencias = listPreferencias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
