package br.com.solution.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.solution.model.Preferencia;

public class Util {
	
	
	public Map<String, String> listaCaptura(List<Preferencia> listaPreferencias){
		
		Integer codig5678 = 5678;
		Integer codig7890 = 7890;
		
		Map<String, String> preferenciaPriorizada = new HashMap<String, String>();
		
		for(Preferencia preferencia: listaPreferencias) {
			if(preferencia.getCodigo().equals(codig5678) || preferencia.getCodigo().equals(codig7890)) {
				preferenciaPriorizada.put("codigo", preferencia.getCodigo().toString());
				preferenciaPriorizada.put("descricao", preferencia.getDescricao().toString());
			}
		}
		
		return preferenciaPriorizada;
	}
	
}
