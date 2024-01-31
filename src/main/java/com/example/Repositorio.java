package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class Repositorio {

}

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Interger> {
    List<acao> findAll();
}