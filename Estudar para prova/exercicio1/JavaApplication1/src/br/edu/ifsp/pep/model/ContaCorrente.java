package br.edu.ifsp.pep.model;


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.eclipse.persistence.annotations.DiscriminatorClass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "conta_corrente")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@IdClass(ContaCorrentePK.class)
public class ContaCorrente implements Serializable{
    
    @Id
    @Column(name = "numero_conta", nullable = false)
    private String numeroConta;
    
    @Id
    @Column(name = "agencia", nullable = false)
    private String agencia;
    
    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    
    
}
