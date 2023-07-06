package com.hkprogrammer.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogrammer.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
