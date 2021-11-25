package br.com.lomalindanaturais.repositories;

import br.com.lomalindanaturais.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaService extends JpaRepository<Categoria, Integer> {
}
