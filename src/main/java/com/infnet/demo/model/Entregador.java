package com.infnet.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Entregador {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "capacidadeDoVeiculo")
    private Integer capacidadeDoVeiculo;

    public Entregador() {
    }

    public Entregador(Long id, String nome, String cpf, Integer capacidadeDoVeiculo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.capacidadeDoVeiculo = capacidadeDoVeiculo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getCapacidadeDoVeiculo() {
        return capacidadeDoVeiculo;
    }

    public void setCapacidadeDoVeiculo(Integer capacidadeDoVeiculo) {
        this.capacidadeDoVeiculo = capacidadeDoVeiculo;
    }
}
