package com.mca.monceitual.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController  //Diz que é um controlador REST
@RequestMapping(value="/Categorias") // responde por este endpoint
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET) // Associou ao verbo HTTP
	public String listar() {
	return "Rest esta funcionando !";
}
}