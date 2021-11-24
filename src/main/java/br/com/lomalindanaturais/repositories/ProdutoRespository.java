package br.com.lomalindanaturais.repositories;

import br.com.lomalindanaturais.domain.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRespository extends JpaRepository<Produtos, Integer> {

}
