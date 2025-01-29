package com.mca.monceitual.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mca.monceitual.domain.Categoria;


@RestController  //Diz que é um controlador REST
@RequestMapping(value="/Categorias") // responde por este endpoint
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET) // Associou ao verbo HTTP
	public List<Categoria> listar() {
		
	Categoria cat1 = new Categoria(1, "Informatica");	
	Categoria cat2 = new Categoria(2, "Escritorio");
	
	List<Categoria> lista = new ArrayList<>();
	lista.add(cat1);
	lista.add(cat2);
	
	
	return lista; 
	
	}
}
