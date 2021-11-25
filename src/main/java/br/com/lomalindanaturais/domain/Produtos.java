package br.com.lomalindanaturais.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter

public class Produtos implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
    private Long id;
    private String nomeProduto;
    private Double quantidadeProduto;
    private String tipoEmbalagem;
    private Double precoDeCusto;
    private Double precoDeVenda;
    private Double percentualdeAcrescimo;
    private Double decimalAcrescimo = percentualdeAcrescimo/100; //variavel para calculo do preco de venda
    private String descricaoProduto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos)) return false;
        Produtos produtos = (Produtos) o;
        return id.equals(produtos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
