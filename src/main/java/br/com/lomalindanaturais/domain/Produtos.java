package br.com.lomalindanaturais.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Produtos extends Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeProduto;
    private Double quantidadeProduto;
    private String tipoEmbalagem;
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
