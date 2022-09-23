/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "veiculo", uniqueConstraints = {
    @UniqueConstraint(
            name = "unique_cidade_placa",
            columnNames = {"cidade", "placa"})
        
})
@NamedQueries(value = {
        @NamedQuery(name = "Veiculo.buscarTodos",
                query = "SELECT v FROM Veiculo v"),
        @NamedQuery(name = "Veiculo.buscarPorPlacaECidade",
                query = "SELECT v FROM Veiculo v WHERE v.cidade = :cidade AND v.placa = :placa"),
        @NamedQuery(name = "Veiculo.buscarDisponiveisParaLocacao",
                query = "SELECT v FROM Veiculo v Where v.situacao = false")
})
public class Veiculo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "placa", nullable = false, length = 8)
    private String placa;
    
    @Column(name = "cidade", nullable = false, length = 30)
    private String cidade;
    
    @Column(name = "modelo", nullable = false, length = 25)
    private String modelo;
    
    @Column(name = "ano", nullable = false)
    private int ano;
    
    @Column(name = "locado", nullable = false)
    private boolean locado;
    
    @ManyToOne
    @JoinColumn(name = "tipo_veiculo_id", nullable = false)
    private TipoVeiculo tipo;
    

    public Veiculo(boolean locado) {
        this.locado = false;
    }

    public Veiculo(String placa, String cidade, String modelo, int ano, TipoVeiculo tipo, boolean locado) {
        this.placa = placa;
        this.cidade = cidade;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.locado = false;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
    
}
