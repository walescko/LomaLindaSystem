package br.com.lomalindanaturais.services;

import br.com.lomalindanaturais.repositories.ProdutoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRespository produtoRespository;


}
