package com.hkprogrammer.algamoney.api.resource;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkprogrammer.algamoney.api.event.RecursoCriadoEvent;
import com.hkprogrammer.algamoney.api.model.Pessoa;
import com.hkprogrammer.algamoney.api.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaRepository repository;
	
	@Autowired
	private ApplicationEventPublisher publisher;

	@GetMapping
	public List<Pessoa> listar() {
		return repository.findAll();
	}

	@PostMapping	
	public ResponseEntity<Pessoa> create(@RequestBody @Valid Pessoa obj, HttpServletResponse response) {
		Pessoa objSaved = repository.save(obj);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, objSaved.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(objSaved);
	}
	
	@GetMapping("/{codigo}") 
	public Optional<Pessoa> buscarPeloCodigo(@PathVariable Long codigo) {
		return repository.findById(codigo);
	}

}
