package com.hkprogrammer.algamoney.api.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hkprogrammer.algamoney.api.model.Pessoa;
import com.hkprogrammer.algamoney.api.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaRepository repository;

	@GetMapping
	public List<Pessoa> listar() {
		return repository.findAll();
	}

	@PostMapping	
	public ResponseEntity<Pessoa> create(@RequestBody @Valid Pessoa obj, HttpServletResponse response) {
		Pessoa objSaved = repository.save(obj);
		
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(objSaved.getCodigo()).toUri();
		
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(objSaved);
	}
	
	@GetMapping("/{codigo}") 
	public Optional<Pessoa> buscarPeloCodigo(@PathVariable Long codigo) {
		return repository.findById(codigo);
	}

}
