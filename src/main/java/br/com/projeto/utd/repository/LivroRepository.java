package br.com.projeto.utd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.utd.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
