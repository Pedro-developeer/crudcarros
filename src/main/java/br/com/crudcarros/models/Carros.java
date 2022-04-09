package br.com.crudcarros.models;

import javax.persistence.*;

@Entity
public class Carros {
    @Id //estabelece que esse atributo será chave primária
    @GeneratedValue(strategy = GenerationType. IDENTITY) //auto incremental

    @Column(nullable = false)
    private Long id;
    private String modelo;
    private String marca;
    private int ano;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
