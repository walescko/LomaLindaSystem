package br.com.lomalindanaturais.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Setter
@Getter
public class Categoria implements Serializable {
    public static final long seriealVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String categoria;

    public Categoria() {
    }

    public Categoria(Integer id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria = (Categoria) o;
        return id.equals(categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
