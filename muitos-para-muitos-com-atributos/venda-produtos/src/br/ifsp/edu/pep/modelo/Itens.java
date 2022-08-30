/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "itens")
public class Itens implements Serializable{
    
    @EmbeddedId
    private ItensPK itensPK;
    
    @ManyToOne
    @JoinColumn(name = "venda_id", nullable = false)
    private Venda venda;
    
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;
    
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    
    @Column(name = "preco", nullable = false, precision = 8, scale = 2)
    private BigDecimal preco;

    public ItensPK getItensPK() {
        return itensPK;
    }

    public void setItensPK(ItensPK itensPK) {
        this.itensPK = itensPK;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    
}
