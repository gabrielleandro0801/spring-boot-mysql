package com.example.gabrielsousa.springbootcommysql.repository;

import com.example.gabrielsousa.springbootcommysql.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
