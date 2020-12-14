package br.com.solution.mock;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.solution.model.Cliente;
import br.com.solution.model.Preferencia;

public class Exemplo {

	public Exemplo() {
		super();
	}
	
	public String getClienteAnderson() {
		
		Cliente cliente = new Cliente();
		List<Preferencia> listPreferencias = this.getMultiplePreferences();
		
		cliente.setNome("Anderson Braz de Sousa");
		cliente.setEmail("contato@andersonbraz.com");
		cliente.setTelefone("+5506199998888");
		cliente.setListPreferencias(listPreferencias);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonResult = gson.toJson(cliente);
		
		return jsonResult;
		
	}
	
	public String getClienteJoao() {
		
		Cliente cliente = new Cliente();
		List<Preferencia> listPreferencias = this.getUniquePreference();
		
		cliente.setNome("João Rossi Braz");
		cliente.setEmail("joao@andersonbraz.com");
		cliente.setTelefone("+5506199998888");
		cliente.setListPreferencias(listPreferencias);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonResult = gson.toJson(cliente);
		
		return jsonResult;
		
	}
	
	public List<Preferencia> getMultiplePreferences() {
		
		Preferencia p1 = new Preferencia();
		Preferencia p2 = new Preferencia();
		Preferencia p3 = new Preferencia();

		p1.setCodigo(1234);
		p1.setDescricao("Codigo Cliente 1234");
		
		p2.setCodigo(2345);
		p2.setDescricao("Codigo Cliente 2345");
		
		p3.setCodigo(5678);
		p3.setDescricao("Codigo Cliente 5678");
		
		List<Preferencia> listPreferencias = Arrays.asList(p1, p2, p3);
		
		return listPreferencias;
		
	}
	
	public List<Preferencia> getUniquePreference() {
		
		Preferencia p1 = new Preferencia();
		
		p1.setCodigo(1234);
		p1.setDescricao("Codigo Cliente 1234");
		
		List<Preferencia> listPreferencias = Arrays.asList(p1);
		
		return listPreferencias;
		
	}

}
