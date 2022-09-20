/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;

/**
 *
 * @author aluno
 */
public class VeiculoLocadoPK implements Serializable{
    
    private long locacao;
    
    private long veiculo;

    public long getLocacao() {
        return locacao;
    }

    public void setLocacao(long locacao) {
        this.locacao = locacao;
    }

    public long getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(long veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (this.locacao ^ (this.locacao >>> 32));
        hash = 83 * hash + (int) (this.veiculo ^ (this.veiculo >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VeiculoLocadoPK other = (VeiculoLocadoPK) obj;
        if (this.locacao != other.locacao) {
            return false;
        }
        return this.veiculo == other.veiculo;
    }
    
    
}
