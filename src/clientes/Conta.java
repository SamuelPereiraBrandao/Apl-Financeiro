/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import eventos.Eventos;
import tarifas.Impostos;

/**
 *
 * @author 00250205
 */
public class Conta implements Eventos, Impostos{
    
    private float saldo;
    
    public Conta(){
        this.saldo = 0.0f;
    }
    
    public Conta(float saldo){
        this.saldo = saldo;
    }

    @Override
    public float getSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(float valor) {
        
        this.saldo += valor;
    }

    @Override
    public void sacar(float valor) {
        
        this.saldo -= valor + valor * CPMF;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String toString(){
        return "Saldo Atual R$ " + this.getSaldo();
    }
    
}
