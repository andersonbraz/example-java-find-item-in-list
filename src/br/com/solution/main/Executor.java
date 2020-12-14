package br.com.solution.main;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.solution.mock.Exemplo;
import br.com.solution.model.Preferencia;
import br.com.solution.util.Util;

public class Executor {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		Exemplo exemplo = new Exemplo();
		
		String clienteAnderson = exemplo.getClienteAnderson();
		String clienteJoao = exemplo.getClienteJoao();
		List<Preferencia> listaPreferencias = exemplo.getUniquePreference();
		
		Util util = new Util();
		Map<String, String> resultado = util.listaCaptura(exemplo.getUniquePreference());
		
		System.out.println("BEGIN Show Clientes: -------------------------");
		System.out.println(clienteAnderson);
		System.out.println(clienteJoao);
		System.out.println("END Show Clientes: -------------------------");
		
		System.out.println("BEGIN Preferences: -------------------------");
		
		if(resultado.size() > 1 && !resultado.isEmpty()) {
			System.out.println(resultado.get("codigo"));
			System.out.println(resultado.get("descricao"));
			System.out.println("END Preferences: -------------------------");
		}else {
			System.out.println(listaPreferencias.get(0).getCodigo().toString());
			System.out.println(listaPreferencias.get(0).getDescricao().toString());
			System.out.println("END Preferences: -------------------------");
		}
		
	}


}
