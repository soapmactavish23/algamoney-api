package com.hkprogrammer.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogrammer.algamoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
